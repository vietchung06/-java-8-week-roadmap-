package Buoi3;

import java.util.Scanner;

public class Bai4 {
    // giải phương trình bậc nhất ax+b=0   3 trường hợp  a = 0 và b = 0 pt vô số nghiệm
    //a!=0 pt vô nghiem
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a:");
        double a = sc.nextDouble();
        System.out.println("Nhập b:");
        double b = sc.nextDouble();
        double x = -b/a;

        if(a != 0){
            System.out.println("Phương trình có 1 nghiệm"+ x);
        } else if (b != 0) {
            System.out.println("Phương trình vô nghiệm");
        }else {
            System.out.println("Phương trình vô số nghiệm");
        }
    }
}
