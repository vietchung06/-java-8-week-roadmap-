package Buoi3;

import java.util.Scanner;

public class MayATMMini {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soDu = 100000;
        int pinDung = 555;

        System.out.println("Nhập mã PIN:");
        int pin = sc.nextInt();

        if (pin != pinDung){
            System.out.println("Mã PIN sai");
            return;
        }
        System.out.println("===============");
        System.out.println("CN1: Xem số dư");
        System.out.println("CN2: Nạp tiền");
        System.out.println("CN3: Rút tiền");
        System.out.println("CN4: Đổi PIN");
        System.out.println("===============");
        System.out.println("Chọn chức năng");

        int chon = sc.nextInt();
        switch (chon){
            case 1 -> System.out.println("Số dư hiện tại:"+ soDu);
            case 2 -> {
                System.out.println("Vào chức năng nạp tiền");
                System.out.println("Nhập số tiền muốn nạp");
                int tienNap = sc.nextInt();
                if(tienNap <= 0){
                    System.out.println("Phải nạp số tiền lớn hơn 0");
                }else {
                    soDu = soDu + tienNap;
                    System.out.println("Nạp tiền thành công");
                    System.out.println("Số tiền nạp là:"+ tienNap +"tổng:"+ soDu);

                }
            }
            case 3 -> {
                System.out.println("Vào chức năng rút tiền");
                System.out.println("Nhập số tiền muốn rút:");
                int tienRut = sc.nextInt();
                if(tienRut <= 0){
                    System.out.println("Số tiền rút không được nhỏ hơn không");
                } else if (tienRut % 50000 != 0) {
                    System.out.println("Số tiền rút phải chia hết cho 50000");
                } else if (tienRut > soDu) {
                    System.out.println("Số dư không đủ");
                }else {
                    System.out.println("Đã rút tiền");
                }
            }
            case 4 -> {
                System.out.println("Vào chức năng đổi mã PIN");
                System.out.println("Nhập lại mã PIN cũ");
                int P = sc.nextInt();
                if (P != pinDung){
                    System.out.println("Mã PIN sai");
                }else {
                    System.out.println("Nhập mã PIN mới:");
                    int pinMoi = sc.nextInt();
                    System.out.println("Đổi mã PIN thành công:"+ pinMoi);
                }
            }

            default -> System.out.println("Số không hợp lệ");
        }

    }
}
