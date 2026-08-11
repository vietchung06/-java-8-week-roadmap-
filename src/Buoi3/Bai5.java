package Buoi3;

import java.util.Scanner;
// giai pt bac 2: ax^2 + bx + c = 0 nếu a=0 -> về pt bậc 1 : bx + c = 0
//nếu a != 0 -> delta = b^2 - 4ac nếu delta > 0 -> pt có 2 nghiệm
//x1 = -b + căn delta / 2a
//x2 = -b - căn delta / 2a


public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a:");
        double a = sc.nextDouble();
        System.out.println("Nhập b:");
        double b = sc.nextDouble();
        System.out.println("Nhập c:");
        double c = sc.nextDouble();
        if (a == 0){
            if (b == 0){
               if (c == 0){
                   System.out.println("Phương trình vô số nghiệm");
               }else {
                   System.out.println("Phương trình vô nghiệm");
               }
            } else {
                double x = -c / b;
                System.out.println("Phương trình có một nghiệm:"+ x);
            }

        }else {
            double delta = b * b - 4 * a *c;
            if (delta < 0){
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                double x = -b / 2 * a;
                System.out.println("Phương trình có 1 nghiệm kép"+ x);
            }else {
                double x1 = -b + Math.sqrt(delta) / (2 * a);
                double x2 = -b - Math.sqrt(delta) / (2 * a);
                System.out.println("Phương trình có 2 nghiệm là:");
                System.out.println("X1:"+ x1);
                System.out.println("X2:"+ x2);
            }
        }
    }
    }

