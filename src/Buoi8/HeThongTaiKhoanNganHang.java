package Buoi8;

import java.util.Scanner;

class Account{
    protected String accountNumber;
    protected String owner;
    protected double balance;

    public Account(String accountNumber, String owner, double balance){
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }


    public void deposit(double amount){
        if (amount <= 0) {
            System.out.println("Số tiền không hợp lệ");
        } else {
            balance += amount;
            System.out.println("Nạp tiền thành công");
        }
    }
    public void withdraw(double amount){
        if (amount <= 0) {
            System.out.println("Số tiền rút phải > 0!");
        } else if (amount > balance) {
            System.out.println("Số dư không đủ!");
        } else {
            balance -= amount;
            System.out.println("Rút tiền thành công!");
        }
    }
    @Override
    public String toString() {
        return "STK: " + accountNumber
                + ", Chủ TK: " + owner
                + ", Số dư: " + balance;
    }

}
class SavingAccount1 extends Account {
    double laiSuat;
    public  SavingAccount1(String accountNumber, String owner, double balance, double laiSuat){
        super(accountNumber, owner, balance);
        this.laiSuat = laiSuat;
    }

    public double getLaiSuat() {
        return laiSuat;
    }

    public void addMonthlyInterest(){
       balance += balance * laiSuat;
    }
    @Override
    public void withdraw(double amount){
        if (amount <= 0) {
            System.out.println("Số tiền rút phải > 0!");
        } else if (amount > balance * 0.8) {
            System.out.println("Không được rút quá 80%");
        } else {
            balance -= amount;
            System.out.println("Rút tiền thành công!");
        }
    }
    @Override
    public String toString() {
        return "SavingAccount{" +
                "STK='" + accountNumber + '\'' +
                ", owner='" + owner + '\'' +
                ", số dư=" + balance +
                ", Lãi suất=" + laiSuat +
                '}';
    }

}
class CheckingAccount extends Account{
    double overdraftLimit;
    public CheckingAccount(String accountNumber, String owner, double balance, double overdraftLimit){
        super(accountNumber, owner, balance);
        this.overdraftLimit = overdraftLimit;

    }
    @Override
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Số tiền rút phải > 0!");
        } else if (amount > balance + overdraftLimit) {
            System.out.println("Vượt quá hạn mức thấu chi!");
        } else {
            balance -= amount;
            System.out.println("Rút tiền thành công!");
        }
    }

    @Override
    public String toString() {
        return "CheckingAccount | STK: " + accountNumber
                + " | Chủ TK: " + owner
                + " | Số dư: " + balance
                + " | Hạn mức thấu chi: " + overdraftLimit;
    }

}
public class HeThongTaiKhoanNganHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account[] accounts = {
        new SavingAccount1("Chung123", "Chung", 2000, 0.1),
        new CheckingAccount("Nam123", "Nam", 5000, 0.1)

    };

        int chon;
        do {
            System.out.println("=====MENU=====");
            System.out.println("CN1 : In thông tin");
            System.out.println("CN2 : Nạp tiền theo số tài khoản");
            System.out.println("CN3 : Rút tiền theo số tài khoản");
            System.out.println("CN4 : Cộng lãi hàng loạt");
            System.out.println("CN5 : Thoát");
            System.out.print("Nhập chức năng muốn chọn : ");
            chon = sc.nextInt();
            switch (chon){
                case 1 ->{
                    System.out.println("Chức năng 1");

                    for (int i = 0; i < accounts.length; i++) {
                        System.out.println(accounts[i]);
                    }
                }
                case 2 ->{
                    System.out.println("Chức năng 2");

                    sc.nextLine();

                    System.out.print("Nhập số tài khoản : ");
                    String soTaiKhoan = sc.nextLine();

                    if (soTaiKhoan.equals(accounts[0].accountNumber)) {

                        System.out.print("Nhập số tiền muốn nạp : ");
                        double tienNap = sc.nextDouble();

                        accounts[0].deposit(tienNap);

                    } else if (soTaiKhoan.equals(accounts[1].accountNumber)) {

                        System.out.print("Nhập số tiền muốn nạp : ");
                        double tienNap = sc.nextDouble();

                        accounts[1].deposit(tienNap);

                    } else {
                        System.out.println("Số tài khoản không đúng");
                    }

                }
                case 3 ->{
                    System.out.println("Chức năng 3");

                    sc.nextLine();

                    System.out.print("Nhập số tài khoản : ");
                    String soTaiKhoan = sc.nextLine();

                    if (soTaiKhoan.equals(accounts[0].accountNumber)) {

                        System.out.print("Nhập số tiền muốn rút : ");
                        double tienRut = sc.nextDouble();

                        accounts[0].withdraw(tienRut);

                    } else if (soTaiKhoan.equals(accounts[1].accountNumber)) {

                        System.out.print("Nhập số tiền muốn rút : ");
                        double tienRut = sc.nextDouble();

                        accounts[1].withdraw(tienRut);

                    } else {
                        System.out.println("Số tài khoản không đúng");
                    }

                }
                case 4 ->{
                    System.out.println("Chức năng 4");
                }
                case 5 ->{
                    System.out.println("Thoát");
                }
                default -> {
                    System.out.println("Nhập sai");
                }
            }
        }while (chon != 5);
    }
}
