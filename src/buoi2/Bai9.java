package buoi2;

import java.util.Scanner;

public class Bai9 {
    //tách số nguyên 3 chữ số thành hàng trăm hàng chục hàng đơn vị bằng (/, %)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên có 3 chữ số:");
        int so = sc.nextInt();
        int hangTram = so / 100;
        int hangChuc = (so / 10) % 10;
        int hangDonVi = so % 10;
        System.out.println(hangTram);
        System.out.println(hangChuc);
        System.out.println(hangDonVi);
    }

}
