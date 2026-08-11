package Buoi3;

import java.util.Scanner;
//phân loại ngày làm viwwcj và cuối tuần bằng switch
public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ngày:");
        int day = sc.nextInt();
        switch (day){
            case 1 -> System.out.println("Ngày lam việc");
            case 2 -> System.out.println("Ngày lam việc");
            case 3 -> System.out.println("Ngày lam việc");
            case 4 -> System.out.println("Ngày lam việc");
            case 5 -> System.out.println("Ngày lam việc");
            case 6, 7 -> System.out.println("Ngày cuối tuần");
            default -> System.out.println("NGày không hợp lệ");
        }
    }
}
