package Buoi4;

import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tong = 0;
        int max = 0;
        int min = 0;

        while (true){
            System.out.println("Nhập số:");
            int so = sc.nextInt();
            if(so == 0){
                break;
            }
            tong += so;

            min = Math.min(so, min);
            max = Math.max(so, max);

        }
        System.out.println("Tổng các số vừa nhập là = "+tong);
        System.out.println("Số lớn nhất là:"+ max);
        System.out.println("Số nhỏ nhất là:"+ min);
    }
}
