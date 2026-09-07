package Buoi14;
//8.	Viết BankAccount.transfer() (tuần 2) phiên bản mới: ném InsufficientBalanceException thay vì in lỗi;
// chỗ gọi bắt exception và in "Giao dịch thất bại: ...".


// Custom Exception
class InsufficientBalanceException1 extends RuntimeException {
    public InsufficientBalanceException1(String message) {
        super(message);
    }
}

class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void transfer(BankAccount toAccount, double amount) {

        if (amount > balance) {
            throw new InsufficientBalanceException1("Số dư không đủ");
        }

        balance -= amount;
        toAccount.balance += amount;
    }

    @Override
    public String toString() {
        return "Chủ tài khoản: " + owner
                + " - Số dư: " + balance;
    }
}

public class Bai8 {
    public static void main(String[] args) {

        BankAccount bank1 = new BankAccount("Anh", 10000);
        BankAccount bank2 = new BankAccount("Chung", 5000);

        System.out.println("Trước khi chuyển:");
        System.out.println(bank1);
        System.out.println(bank2);

        try {
            bank1.transfer(bank2, 15000);

            System.out.println("Chuyển tiền thành công");

        } catch (InsufficientBalanceException1 e) {

            System.out.println(
                    "Giao dịch thất bại: " + e.getMessage()
            );
        }

        System.out.println("Sau khi chuyển:");
        System.out.println(bank1);
        System.out.println(bank2);
    }
}