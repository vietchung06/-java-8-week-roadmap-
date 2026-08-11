package Buoi3;

import java.util.Scanner;
//tính tiền điện
public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số điện:");
        int soDien = sc.nextInt();
        int tienDien;
        if (soDien >= 0 && soDien <=50){
            tienDien = soDien * 1800;
            System.out.println("Tiền điện:"+ tienDien);
        } else if (soDien >=51 && soDien <= 100) {
            tienDien = soDien * 2000;
            System.out.println("Số điện:"+ tienDien);
        }else {
            tienDien = soDien * 2500;
            System.out.println("Số điện:"+ tienDien);
        }
    }
}
