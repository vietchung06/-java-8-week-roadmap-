package Buoi14;

import java.util.InputMismatchException;
import java.util.Scanner;

//1.	Chia 2 số nhập từ bàn phím, bắt cả ArithmeticException
// (chia 0) lẫn InputMismatchException (nhập chữ thay vì số).
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhập a: ");
            int a = sc.nextInt();
            System.out.println("Nhập b: ");
            int b = sc.nextInt();
            int ketQua = a / b;
            System.out.println(ketQua);
        }catch (ArithmeticException ex){
            System.out.println("Không được chia cho 0");
        }catch (InputMismatchException e){
            System.out.println("Nhập chữ thay v số");
        }
    }
}
