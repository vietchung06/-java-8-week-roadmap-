package Buoi4;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên:");
        int n = sc.nextInt();
        int dem = 0;
        int tong=0;
        System.out.println("Các ước của "+ n +"là:");
        for (int i = 1; i <= n; i++){

            if (n % i == 0){
                System.out.println(+ i + "");
                dem++;
                if (i < n){
                    tong += i;

                }

            }

        }
        System.out.println("Có "+ dem +" ước");
        System.out.println("Tổng các ước nhỏ hơn của "+ n +" = "+tong);
        if(tong == n){
            System.out.println("Đây là số hoàn hảo");
        }else {
            System.out.println("Đây không phải số hoàn hảo");
        }

    }
}

