package Buoi4;

import java.util.Scanner;
//8.Tính dãy Fibonacci: in n số đầu tiên của dãy 1, 1, 2, 3, 5, 8...
public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n");
        int n = sc.nextInt();
        System.out.println(n + " số đầu tiên trong dãy là:");
        int a = 1;
        int b = 1;
        for (int i = 1; i <= n; i++){
            System.out.println(+ a);

            int c = a + b;
            a = b;
            b = c;

        }//4 số đầu
    }
}
//1 1 2

