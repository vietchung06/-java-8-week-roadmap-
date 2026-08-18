package Buoi7;

import java.util.Scanner;

class Wallet {
    private String owner;
    private double balance;
    private String transactionHistory;

    public Wallet(String owner, double balance, String transactionHistory){
        this.owner = owner;
        this.balance = balance;
        this.transactionHistory = transactionHistory;
    }
    public void toUp(double amount){
        if(amount <= 0){
            System.out.println("Nạp tiền không thành công");
            return;

        }
        balance += amount;
        transactionHistory += "Đã nap : "+ amount;
        System.out.println("Nạp tiền thành công");


    }
    public void pay(double amount){
        if (amount <= 0){
            System.out.println("Thanh toán không thành công");
            return;
        }
        if (amount > balance){
            System.out.println("Không rút được quá số dư");
            return;
        }
        balance -= amount;
        transactionHistory += "Thanh toán : "+ amount;
        System.out.println("Thanh toán thành công");

    }

    public double getBalance() {
        return balance;
    }

    public String getHistory() {
        return transactionHistory;
    }
}
public class ViDienTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Wallet wallet = new Wallet("Việt chung", 2000,"");
        int chon;
        do {
            System.out.println("====MENU====");
            System.out.println("CN1 : Nạp tiền");
            System.out.println("CN2 : Thanh toán");
            System.out.println("CN3 : Xem số dư");
            System.out.println("CN4 : Xem lịch sử");
            System.out.println("CN5 : Thoát");
            System.out.print("Chọn chức năng : ");
            chon = sc.nextInt();
            switch (chon) {
                case 1 -> {
                    System.out.println("Chức năng 1");
                    System.out.println("Nhập số tiền muốn nạp : ");
                    double tienNap = sc.nextDouble();
                    wallet.toUp(tienNap);

                }
                case 2 -> {
                    System.out.println("Chức năng 2");
                    System.out.println("Nhập số tiền muốn thanh toán : ");
                    double tienThanhToan = sc.nextDouble();
                    wallet.pay(tienThanhToan);
                }
                case 3 -> {
                    System.out.println("Chức năng 3");
                    System.out.println("Số dư : "+ wallet.getBalance() );
                }
                case 4 -> {
                    System.out.println("Chức năng 4");
                    System.out.println("Lịch sử giao dịch : "+ wallet.getHistory());

                }
                case 5 -> {
                    System.out.println("Thoát");
                }
                default -> {
                    System.out.println("Số không hợp lệ");
                }

            }
            }
            while (chon != 5) ;

        }
}
