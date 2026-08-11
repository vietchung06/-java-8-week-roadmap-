package Buoi3;

import java.util.Scanner;
//validate để trên đầu
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm");
        double diem = sc.nextDouble();
        if (diem < 0 || diem >10){
            System.out.println("Lỗi");
            return;
        }
        if ( diem >=8){
            System.out.println("Giỏi");
        } else if (diem >= 6.5 ) {
            System.out.println("Khá");
        } else if (diem >=5 ) {
            System.out.println("Trung bình");
        }else {
            System.out.println("Yếu");
        }
    }
}
