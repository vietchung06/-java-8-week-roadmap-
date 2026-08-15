package Buoi5;

import java.lang.reflect.Array;
import java.util.Scanner;
//12.	Tách một câu thành các từ bằng .split(" "), in ra số từ và từ dài nhất.
//length() → dùng cho String → đếm số ký tự
//length   → dùng cho mảng    → đếm số phần tử
public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một câu: ");
        String cau = sc.nextLine();

        String [] tu = cau.split(" ");
        String tuDaiNhat = tu[0];
        for (int i =0; i < tu.length; i++){
            if (tu[i].length() > tuDaiNhat.length()){
                tuDaiNhat = tu[i];

            }
        }
        System.out.println("Số từ: "+ tu.length);
        System.out.println("Từ dài nhất: "+ tuDaiNhat);

    }
}
