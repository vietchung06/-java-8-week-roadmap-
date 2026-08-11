package Buoi2;

import java.util.Scanner;
// check xem số có phải số chẵn k
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số:");
        int so = sc.nextInt();
        boolean s = so % 2 == 0;
        System.out.println(s);
    }
}
