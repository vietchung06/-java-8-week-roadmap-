package Buoi5;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();

        s = s.toLowerCase();

        int nguyenAm = 0;
        int phuAm = 0;
        int chuSo = 0;
//achung123 -> i<9
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                chuSo++;
            } else if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                nguyenAm++;
            } else if (c >= 'a' && c <= 'z') {
                phuAm++;
            }
        }
        System.out.println("Nguyên âm: " + nguyenAm);
        System.out.println("Phụ âm: " + phuAm);
        System.out.println("Chữ số: " + chuSo);
    }
}