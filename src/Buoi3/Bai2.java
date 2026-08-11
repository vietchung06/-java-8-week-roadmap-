package Buoi3;

import java.util.Scanner;
// tính nam nhuan chia hết 400 hoặc chia hết 4 nhưng không chia hết 100
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số năm");
        int nam = sc.nextInt();
        if(nam % 400 == 0 || (nam % 4 == 0 && nam % 100 != 0)){
            System.out.println("Năm nhuận");
        }else {
            System.out.println("Không phải năm nhuân");
        }
    }
}
