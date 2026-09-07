package Buoi14;
//5.	Vòng lặp nhập liệu "lì đòn": bắt người dùng nhập đến khi đúng số nguyên trong khoảng cho trước
// (try-catch trong while — mẫu code dùng ở mọi bài nhập liệu sau này).
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner((System.in));
        int number;
        while (true){
            try {
                System.out.println("Nhập số nguyên từ 1-10: ");
                number = sc.nextInt();
                if (number < 1 || number > 10){
                    System.out.println("Số phải từ 1-10");
                    continue;
                }
                break;
            }catch (InputMismatchException ex){
                System.out.println("Phải nhập số nguyên");
                sc.nextLine();
            }
        }
        System.out.println("Bạn đã nhập đúng : "+ number);
    }
}