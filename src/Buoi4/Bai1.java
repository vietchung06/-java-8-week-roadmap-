package Buoi4;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập bảng cửu chương:");
        int so = sc.nextInt();

        for (int i = 1; i <= 10; i ++){

            System.out.println(so + "x" + i + "=" + (so * i));

        }

        for (int i=1; i <= 9; i ++){
            System.out.println("Bảng cửu chương:"+i);
            for (int j = 1; j <= 10; j++){
                System.out.println(+i + "x" + j + "=" + (i * j));
            }
        }

    }
    }

