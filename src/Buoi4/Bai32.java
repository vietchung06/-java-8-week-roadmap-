package Buoi4;

import java.util.Scanner;

// in tất cacr các số nguyên tố từ 2 ->n
public class Bai32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n:");
        int n = sc.nextInt();
        System.out.println("Các số nguyên tố từ 2-> "+ n);

         for(int so = 2; so <= n; so++){
             int dem =0;
           for (int i = 1; i <= so; i++){
               if(so % i ==0){
                   dem++;
               }
           }
             if (dem == 2 ){
                 System.out.println(+ so +"");
         }

         }
    }
}
