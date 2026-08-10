package buoi2;

import java.util.Scanner;
//Nhập số tuwf bàn phím tính +-*/
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhâp a:");
        int a = sc.nextInt();
        System.out.println("Nhập b:");
        int b = sc.nextInt();
        System.out.println("Tong=\t"+ (a+b));
        System.out.println("Hiệu=\t"+ (a-b));
        System.out.println("Tích=\t"+ a*b);
        System.out.println("Thương nguyên=\t"+ a/b);
        System.out.println("Thương thực=\t"+ (double) a/b);
        System.out.println("Chia lấy dư=\t"+ a%b);


    }
}
