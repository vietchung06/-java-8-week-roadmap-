package Buoi3;

import java.util.Scanner;
// tìm số lớn nhất bằng 3 cách lồng if, toán tử 3 ngôi và Math.max()
public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a:");
        int a = sc.nextInt();
        System.out.println("Nhập b:");
        int b = sc.nextInt();
        System.out.println("Nhập c:");
        int c = sc.nextInt();
        double max;
        if (a > b){
            if(a > c){
                max = a;
            }else {
                max = c;
            }
        }else {
            if(b > c){
                max = b;
            }else {
                max = c;
            }
        }
        System.out.println("Số lớn nhất là:"+ max);

        double max2 = a > b ? a : b;
        max2 = (max2 > c)? max2 :c;
        System.out.println("Số lớn nhất là"+ max2);

        double max3 = Math.max(a, Math.max(b,c));
        System.out.println("Số lớn nhất là:"+ max3);
    }

}
