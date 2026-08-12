package Buoi4;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n:");
        int n = sc.nextInt();
        long giaiThua=1;
//        for(int i = 1; i <= n; i++){
//            giaiThua = giaiThua * i;
//        }
//        System.out.println("Giai thừa của n:"+ giaiThua );
        int i = 1;
        while (i <= n){
            giaiThua = giaiThua * i;
            i++;

        }
        System.out.println("Giai thừa của n:"+giaiThua);
    }
}
//
