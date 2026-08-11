package Buoi2;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập so giay:");
        int soGiay = sc.nextInt();
        int gio = soGiay / 3600;
        int phut = soGiay / 60;
        int giay = soGiay % 60;
        System.out.println("Gio:"+ gio);
        System.out.println("Phút:"+ phut);
        System.out.println("Giây:"+ giay);
    }
}
