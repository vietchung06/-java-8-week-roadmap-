import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập giá tiền:");
        double sotien=sc.nextDouble();
        System.out.println("Nhập số lượng:");
        int sl=sc.nextInt();

        double tongtien=sotien*sl;
        System.out.println("Tổng tiền:"+tongtien);
    }
}
