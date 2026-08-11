package Buoi3;

import java.util.Scanner;
//tính tiền taxi
public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số KM:");
        int km = sc.nextInt();
        double soTien;
        if(km <= 2){
            soTien = 15000 * km;
            System.out.println("Số tiền:"+ soTien);
        } else if (km >= 3 && km <= 10) {
            soTien = 12000 * km;
            System.out.println("Số tiền:"+ soTien);
        }else {
            soTien = 10000 * km;
            System.out.println("Số tiền:"+ soTien);
        }
    }
}
