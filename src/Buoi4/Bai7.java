package Buoi4;

import java.util.Scanner;
// đảo ngược số nguyên dương
public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số nguyên:");
        int n = sc.nextInt();

        int dao = 0;

        while (n > 0) {
            int chuSo = n % 10; // lấy số đầu tin
            dao = dao * 10 + chuSo;
            n = n / 10;
        }

        System.out.println("Số đảo ngược: " + dao);
    }
}
//123 -> chuso=3 -> dao=3 -> n=12 -> chuso=2 -> dao=3*10+2=32
//n=1->
