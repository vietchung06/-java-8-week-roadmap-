package Buoi10;
//2.	Abstract class PaymentMethod với processPayment(double); con CreditCard (phí 2%),
// CashPayment, BankTransfer (phí cố định 3.300đ).
abstract class PaymentMethod {
    public abstract double processPayment(double amount);


}
class CreditCard extends PaymentMethod{

    @Override
    public double processPayment(double amount) {
        return amount + amount * 0.02;
    }
}
class CashPayment extends PaymentMethod{

    @Override
    public double processPayment(double amount) {
        return amount;
    }
}
class BankTransfer extends PaymentMethod{

    @Override
    public double processPayment(double amount) {
        return amount + 3300;
    }
}
public class Bai2 {
    public static void main(String[] args) {
        PaymentMethod[] p ={
                new CreditCard(),
                new CashPayment(),
                new BankTransfer()
        };
        for (int i = 0; i < p.length; i++){
            System.out.println(p[i].processPayment(3000));
        }
    }
}
