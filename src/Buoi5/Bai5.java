package Buoi5;

import java.util.Scanner;

//5.	Tìm kiếm tuyến tính: kiểm tra số x có trong mảng không, trả về index
//Tìm kiếm tuyến tính (Linear Search) là cách tìm một giá trị trong mảng
// bằng cách kiểm tra lần lượt từ đầu đến cuối.
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n:");
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("a[" + i + "] =");
            a[i] = sc.nextInt();

        }
        System.out.print("Nhập số muốn tìm: ");
        int tim = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (a[i] == tim) {
                System.out.println("Đã tìm thấy số tại index = " + i);
            } else {
                System.out.println(" index = "+ i + " không tìm thấy số");
            }
        }
    }
}
