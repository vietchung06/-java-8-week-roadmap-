package Buoi5;

import java.util.Locale;
import java.util.Scanner;

//7.	Nhập chuỗi họ tên bừa bãi (thừa khoảng trắng, viết thường),
// chuẩn hóa thành "Nguyen Van A": trim, tách từ, viết hoa chữ cái đầu mỗi từ.
public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên:");
        String hoTen = sc.nextLine();

        hoTen = hoTen.trim();
        String [] tu = hoTen.split(" ");

        String ketQua = "";
        for (int i = 0; i < tu.length; i++){
            String t = tu[i];

            String tuDau = t.substring(0,1).toUpperCase();//lấy từ index=0 đến trước 1 dừng
            String tuSau = t.substring(1).toLowerCase();
            ketQua += tuDau + tuSau + " ";

        }
        System.out.println("Họ tên hoàn thiện: ");
        System.out.println(ketQua.trim());

    }
}
