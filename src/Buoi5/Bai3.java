package Buoi5;


import java.util.Arrays;
import java.util.Scanner;
//3.	Đảo ngược mảng
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
         int [] a = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("a[" + i + "] = " );
            a[i] = sc.nextInt();

        }
        int dau = 0;
        int cuoi = n - 1;
         while (dau < cuoi){
             int luu = a[dau];
             a[dau] = a[cuoi];
             a[cuoi] = luu;

             cuoi--;
             dau++;
         }

        System.out.println("Mảng sau khi đảo là:") ;
        System.out.print(Arrays.toString(a));//2 cách in mảng
         for (int i = 0; i < n; i++){
             System.out.print( + a[i]   );
         }
    }
}
