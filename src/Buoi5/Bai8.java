package Buoi5;

import java.util.Scanner;

//8.	Kiểm tra chuỗi đối xứng (palindrome), VD "madam" — bỏ qua hoa thường.
public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();
        // Bỏ qua hoa thường
        s = s.toLowerCase();
        boolean doiXung = true;
        // So sánh ký tự đầu với ký tự cuối
        for (int i = 0; i < s.length() / 2; i++) {
            //abcba-> i < 5 -> i=0
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                doiXung = false;
                break;
            }
        }//
        if (doiXung) {
            System.out.println("Chuỗi đối xứng");
        } else {
            System.out.println("Chuỗi không đối xứng");
        }
    }
}
