package Buoi6;
class BankAccount{
    String owner;
    double blance;
    public BankAccount(String owner, double blance){
        this.owner = owner;
        this.blance = blance;
    }
    void  transfer(BankAccount to, double amount){
        blance -= amount;
        to.blance += amount;

    }
}
public class Bai7 {
    public static void main(String[] args) {
        BankAccount a = new BankAccount("Nam", 10000);
        BankAccount b = new BankAccount("Anh", 20000);

        a.transfer(b,5000);
        System.out.println("Tài khoản Nam : "+ a.blance);
        System.out.println("Tài khoản Anh : "+ b.blance);
    }
}
