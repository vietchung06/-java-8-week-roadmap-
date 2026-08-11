package Buoi3;

import java.util.Scanner;
// nhập tháng năm và dùng switch và năm nhuận để tính số ngày chính xác của tháng đó
public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tháng:");
        int thang = sc.nextInt();
        System.out.println("Nhập năm:");
        int nam = sc.nextInt();

        int day = 0;
        boolean namNhuan = nam % 400 ==0 || (nam % 4 == 0 && nam % 100 ==0);
        switch (thang){
            case 1 -> day = 31;
            case 3 -> day = 31;
            case 5 -> day = 31;
            case 7 -> day = 31;
            case 8 -> day = 31;
            case 10 -> day = 31;
            case 12 -> day = 31;
            case 4 -> day = 30;
            case 6 -> day = 30;
            case 9 -> day = 30;
            case 11 -> day = 30;
            case 2 -> day = namNhuan ? 29 : 28 ;
            default -> System.out.println("Ngày không hợp lệ");
         
        }
        System.out.println("Số ngày trong thàng"+ thang +"năm"+ nam + "la:"+ day);
       
    }
}
