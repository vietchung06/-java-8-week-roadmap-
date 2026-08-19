package Buoi8;
//5.	Account (buổi 7) và con SavingAccount thêm interestRate, method addMonthlyInterest()
// cộng lãi qua method của cha
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
class SavingAccount extends BankAccount{
    private double interestRate;
    public SavingAccount(String owner, double balance, double interestRate ){
        super(owner, balance);
        this.interestRate = interestRate;
    }


    public double getInterestRate() {
        return interestRate;
    }


    public void addMonthlyInterest(){
        double interest = getBalance() * getInterestRate();
        deposit(interest);
    }
}
public class Bai5 {
    public static void main(String[] args) {

        SavingAccount s = new SavingAccount("Nam",5000, 0.1);

        System.out.println("Tài khoản tiết kiệm :");
        System.out.println("Tên : "+ s.getOwner());
        System.out.println("Số dư ban đầu: "+ s.getBalance());
        System.out.println("Số lãi xuất : "+ s.getInterestRate());
        s.addMonthlyInterest();
        System.out.println("Số dư sau khi cộng lãi : " + s.getBalance());
    }
}



