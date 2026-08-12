package Buoi3;

import java.util.Scanner;

public class MayATMMini {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soDu = 100000;
        int pinDung = 555;
        int pin;
        int dem = 0;
        String history = "";
    do {
        System.out.println("Nhập mã PIN:");
         pin = sc.nextInt();
         dem++;
         if (pin == pinDung){
             System.out.println("Chính xác");
             break;
         }else {
             System.out.println("Sai");
         }

    }while (dem < 3);


        if (pin != pinDung){
            System.out.println("Bạn đã nhập quá 3 lần");
            return;
        }
        int chon;


    do {
        System.out.println("================================");
        System.out.println("[  CN1: Xem số dư              ]");
        System.out.println("[  CN2: Nạp tiền               ]");
        System.out.println("[  CN3: Rút tiền               ]");
        System.out.println("[  CN4: Đổi PIN                ]");
        System.out.println("[  CN5: Lưu lịch sử giao dịch  ]");
        System.out.println("[  0: Thoát                    ]");
        System.out.println("================================");
        System.out.println("Chọn chức năng");

         chon = sc.nextInt();

        switch (chon) {
            case 1 -> System.out.println("Số dư hiện tại:" + soDu);
            case 2 -> {
                System.out.println("Vào chức năng nạp tiền");
                System.out.println("Nhập số tiền muốn nạp");
                int tienNap = sc.nextInt();
                if (tienNap <= 0) {
                    System.out.println("Phải nạp số tiền lớn hơn 0");
                } else {
                    soDu = soDu + tienNap;
                    history += " Tiền nạp: " + tienNap + " | Số dư: " + soDu + "\n";
                    System.out.println("Nạp tiền thành công");
                    System.out.println("Số tiền nạp là:" + tienNap + "tổng:" + soDu);

                }
            }
            case 3 -> {
                System.out.println("Vào chức năng rút tiền");
                System.out.println("Nhập số tiền muốn rút:");
                int tienRut = sc.nextInt();

                if (tienRut <= 0) {
                    System.out.println("Số tiền rút không được nhỏ hơn không");
                } else if (tienRut % 50000 != 0) {
                    System.out.println("Số tiền rút phải chia hết cho 50000");
                } else if (tienRut > soDu) {
                    System.out.println("Số dư không đủ");
                } else {
                    System.out.println("Đã rút tiền");
                }
                soDu = soDu - tienRut;
                history += "         : Tiền rút: "+ tienRut + " | Số dư:  " +soDu;
            }
            case 4 -> {
                System.out.println("Vào chức năng đổi mã PIN");
                System.out.println("Nhập lại mã PIN cũ");
                int P = sc.nextInt();
                if (P != pinDung) {
                    System.out.println("Mã PIN sai");
                } else {
                    System.out.println("Nhập mã PIN mới:");
                    int pinMoi = sc.nextInt();
                    System.out.println("Đổi mã PIN thành công:" + pinMoi);
                }
            }
            case 5 ->{
                System.out.println("Lịch sử :"+ history );

            }
            case 0 -> System.out.println("Thoát");

            default -> System.out.println("Số không hợp lệ");
        }

    }while (chon != 0 );


    }
}
