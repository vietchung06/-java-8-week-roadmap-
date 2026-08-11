package Buoi2;

import java.util.Scanner;

public class Bai10 {
    //tính điểm trung bình làm tròn 2 chữ số thập phân
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm toán:");
        double toan = sc.nextDouble();
        System.out.println("Nhập điểm van:");
        double van = sc.nextDouble();
        System.out.println("Nhập điểm anh:");
        double anh = sc.nextDouble();

        double diemTb = (toan + van + anh) / 3;
        System.out.println("Điểm tb="+ String.format("%.2f",diemTb));

    }
}
