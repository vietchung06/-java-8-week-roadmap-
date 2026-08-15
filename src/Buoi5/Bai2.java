package Buoi5;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n:");
        int n = sc.nextInt();
        double sum = 0;
        int soChan = 0;
        int soLe = 0;
        int soAm = 0;
        int soDuong = 0;
        double tbc = 0;

        int [] a = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
            sum += a[i];
            tbc = sum / n;
            if (a[i] % 2 == 0){
                soChan++;

            }else {
                soLe++;

            }
            if (a[i] > 0){
                soDuong++;

            }
            else {
                soAm++;
            }
        }
        System.out.println("Có "+ soChan + " số chẵn");
        System.out.println("Có " + soLe + " số lẻ");
        System.out.println("Có "+ soDuong + " số dương");
        System.out.println("Có " + soAm + " số âm");
        System.out.println("Tổng = "+ sum);
        System.out.println("Trung bình cộng = "+ tbc);



    }
}
