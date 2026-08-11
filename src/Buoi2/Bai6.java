package Buoi2;

import java.util.Scanner;
// bài kiểm tra 3 cạnh có hợp leej thành hình tam giác
public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a:");
        int a = sc.nextInt();
        System.out.println("Nhap b :");
        int b = sc.nextInt();
        System.out.println("Nhap c :");
        int c = sc.nextInt();

        boolean dapAn = (a+b > c) && (a+c > b) && (b+c > a);
        System.out.println(dapAn);

    }
}
