package Buoi4;

import java.util.Scanner;
//tìm ucln và bcnn bằng euclid
//ucln
//Bắt đầu với hai số nguyên a và b.
//Nếu b = 0, thì ƯCLN(a, b) = a.
//Ngược lại, tính a % b.
//Thay thế a bằng b và b bằng a % b.
//Lặp lại các bước 2-4 cho đến khi b = 0.
//bcnn = a*b/ucln
public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a = sc.nextInt();
        System.out.println("Nhập b: ");
        int b = sc.nextInt();

        int aBanDau = a;
        int bBanDau= b;

        while (b != 0){
            int soDu = a % b;      //a=12 b=16
            a = b;
            b = soDu;
        }
        int ucln = a;
        int bcnn = (aBanDau * bBanDau) / ucln;
        System.out.println("UCLN = "+ ucln);
        System.out.println("BCNN = "+ bcnn);
    }
}
