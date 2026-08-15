package Buoi4;

import java.util.Scanner;
//3.	Kiểm tra số nguyên tố; là các số có 2 ước chia hết cho 1 và chính nó
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số: ");
        int so = sc.nextInt();

        int dem = 0;

        for (int i = 1; i <= so; i++) {
            if (so % i == 0) {
                dem++;
                if (dem > 2){
                    System.out.println(so + " không phải số nguyên tố");
                    return;

                }
            }
        }

        if (dem == 2) {
            System.out.println(so + " là số nguyên tố");
        } else {
            System.out.println(so + " không phải số nguyên tố");
        }
    }
}
