package Buoi7;
class BankAccount{
   private String owner;
   private double balance;
    public BankAccount(String owner, double balance){
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double blance) {

        this.balance = blance;
    }

    public void deposit(double amount) {
        if (amount >= 0) {
            balance += amount;
            System.out.println("Nạp tiền thành công");
        } else {
            System.out.println("Nạp tiền không thành công");
        }
    }

    public void withdraw(double amount){
            if (amount >= 0){
                balance -= amount;
                System.out.println("Rút tiền thành công");
            }else {
                System.out.println("Rút tền không thành công");
            }
        }
    }

    public class Bai3 {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount("Anh", 10000);
        System.out.println("Chủ tài khoản: " + bank.getOwner());
        System.out.println("Số dư: " + bank.getBalance());
        bank.deposit(5000);
        System.out.println("Số dư sau khi nạp: " + bank.getBalance());
        bank.withdraw(-1);
        System.out.println("Số dư sau khi rút: " + bank.getBalance());
    }
}

