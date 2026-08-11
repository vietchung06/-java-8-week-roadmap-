package Buoi3;

import java.util.Scanner;

public class Bai11 {
    //phân loại tam giác đều cân vuông ,  tam giác đều 3 cạnh =nhau, tam giác cân 2 cạnh bên bằng nhau
    //tam gicas thường các cạnh >=0 và 2 cạnh + vào > cạnh còn lại
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap cạnh a:");
        int a = sc.nextInt();
        System.out.println("Nhap cạnh b :");
        int b = sc.nextInt();
        System.out.println("Nhap cạnh c :");
        int c = sc.nextInt();


        if ((a+b < c) || (a+c < b) || (b+c < a) ){
            System.out.println("Không hợp lệ ");
        }else if(a == b && a == c){
            System.out.println("Đây là tam giac đều");
        } else if (a == b || a == c || b == c) {
            System.out.println("Đây là tam giác cân");
        } else if (((Math.pow(a, 2)) == (Math.pow(b, 2)) + (Math.pow(c, 2))) || ((Math.pow(b, 2)) == (Math.pow(a, 2)) + (Math.pow(c, 2))) || ((Math.pow(c, 2)) == (Math.pow(a, 2)) + (Math.pow(b, 2)))  ) {
            System.out.println("Đây là tam giác vuông");
        }else {
            System.out.println("Đây là tam giác thường");
        }

    }
}
