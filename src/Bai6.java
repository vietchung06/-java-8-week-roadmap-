import java.util.Scanner;
//Nhập dữ liệu từ bàn phím dùng Scanner
public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá tiền:");
        double soTien = sc.nextDouble();
        System.out.println("Nhập số lượng:");
        int sl = sc.nextInt();

        double tongTien=soTien*sl;
        System.out.println("Tổng tiền:"+ tongTien);
    }
}
