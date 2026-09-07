package Buoi14;

import java.util.Scanner;

class AccountNotFoundException extends RuntimeException{
    public AccountNotFoundException(String message){
        super(message);

    }
}
class InsufficientBalanceException extends RuntimeException{
    public InsufficientBalanceException(String message){
        super(message);

    }
}
class InvalidAmountException extends RuntimeException{
    public InvalidAmountException(String message){
        super(message);

    }
}
class Account{
    protected String accountNumber;
    protected String owner;
    protected  double balance;

    public Account(String accountNumber, String owner, double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }
    public void deposit(double amount){
        if (amount <= 0){
            throw new InvalidAgeException("Tiền nạp > 0");

        }
        balance += amount;
        System.out.println("Nạp tiền thành công");
    }
    public void withdraw(double amount){
        if (amount <= 0){
            throw new InvalidAmountException("Số tiền rút > 0");
        }
        if (amount > balance){
            throw new InsufficientBalanceException("Số dư không đủ");
        }
        balance -= amount;
        System.out.println("Rút tiền thành công");
    }
    @Override
    public String toString() {
        return "STK: " + accountNumber
                + ", Chủ TK: " + owner
                + ", Số dư: " + balance;
    }

}
class savingAccount extends Account{
    double laiSuat;
    public savingAccount(String accountNumber, String owner, double balance, double laiSuat) {
        super(accountNumber, owner, balance);
        this.laiSuat = laiSuat;
    }

    public double getLaiSuat() {
        return laiSuat;
    }
    public void  addMonthlyInterest(){
        balance += balance * laiSuat;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0){
            throw new InvalidAmountException("Số tiền rút phải > 0");
        }
        if (amount > balance * 0.8){
            throw new InsufficientBalanceException("Không được rút quá 80%");
        }
        balance -= amount;
        System.out.println("Rút tiền thành công");
    }

    @Override
    public String toString() {
        return "savingAccount | STK: " + accountNumber
                + " | Chủ TK: " + owner
                + " | Số dư: " + balance
                + " | Lãi suất: " + laiSuat;
    }
}
class checkingAccount extends Account{
    double overdraftLimit;
    public checkingAccount(String accountNumber, String owner, double balance, double overdraftLimit) {
        super(accountNumber, owner, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0){
            throw new InvalidAmountException("Số tiền rút > 0");
        }
        if (amount > balance + overdraftLimit){
            throw new InsufficientBalanceException("Số tiền vượt quá giới hạn thấu chi");
        }
        balance -= amount;
    }
    @Override
    public String toString() {
        return "CheckingAccount | STK: " + accountNumber
                + " | Chủ TK: " + owner
                + " | Số dư: " + balance
                + " | Hạn mức thấu chi: " + overdraftLimit;
    }
}
public class NganHangPhongThu3Lop {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        Account[] accounts = {
                new savingAccount("a1", "Chung", 1000, 0.1),
                new checkingAccount("a2", "Anh", 2000, 200)
        };
        int chon = 0;
        do {
            System.out.println("=====MENU=====");
            System.out.println("CN1: In thông tin");
            System.out.println("CN2: Nạp tiền");
            System.out.println("CN3: Rút tiền");
            System.out.println("CN4: Thoát");
            try {
                System.out.println("Nhập chức năng muốn chọn: ");
                chon = sc.nextInt();
                switch (chon){
                    case 1 -> {
                        System.out.println("Chức năng 1");
                        for (int i = 0; i < accounts.length; i++){
                            System.out.println(accounts[i]);
                        }
                    }
                    case 2 -> {
                        System.out.println("Chức năng 2");
                        sc.nextLine();
                        System.out.println("Nhập số tài khoản ");
                        String soTaiKhoan = sc.nextLine();
                        if (soTaiKhoan.equals(accounts[0].accountNumber)){
                            System.out.println("Nhập số tiền muốn nạp: ");
                            double tienNap = sc.nextDouble();
                            accounts[0].deposit(tienNap);
                            System.out.println("Đã nạp "+ tienNap);
                        } else if (soTaiKhoan.equals(accounts[1].accountNumber)) {
                            System.out.println("Nhập số tiền muốn nạp: ");
                            double tienNap = sc.nextDouble();
                            accounts[1].deposit(tienNap);
                            System.out.println("Đã nạp "+ tienNap);
                        }else {
                            throw new AccountNotFoundException("Số tài khoản không tồn tại");
                        }
                    }
                    case 3 -> {
                        System.out.println("Chức năng 3");
                        sc.nextLine();
                        System.out.println("Nhập số tài khoản: ");
                        String so = sc.nextLine();
                        if (so.equals(accounts[0].accountNumber)){
                            System.out.println("Nhập số tiền muốn rút: ");
                            double tienRut = sc.nextDouble();
                            accounts[0].withdraw(tienRut);
                            System.out.println("Đã rút "+ tienRut);
                        }else if (so.equals(accounts[1].accountNumber)){
                            System.out.println("Nhập số tiền muốn rút: ");
                            double tienRut = sc.nextDouble();
                            accounts[1].withdraw(tienRut);
                            System.out.println("Đã rút "+ tienRut);
                        }else {
                           throw new AccountNotFoundException("Số tài khoản không tồn tại");
                        }
                    }

                    case 4 -> {
                        System.out.println("Thoát");
                    }
                    default -> {
                        System.out.println("Số không hợp lệ");
                    }
                }
            }catch (AccountNotFoundException e){
                System.out.println("Lỗi tài khoản "+ e.getMessage());
            }

            catch (InvalidAmountException e){
                System.out.println("Lỗi số tiền "+ e.getMessage());
            }
            catch (InsufficientBalanceException e){
                System.out.println("Lỗi số dư "+ e.getMessage());
                sc.nextLine();
            }

            finally {
                System.out.println("=== Ket thuc thao tac ===");
            }
        }while (chon != 4);
    }
}
