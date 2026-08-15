package Buoi5;

import java.util.Scanner;

public class QuanLyDiemLopHoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhâp số lượng học sinh");
        int soHs = sc.nextInt();
        sc.nextLine();

        String [] ten = new String[soHs];
        double [] diem = new double[soHs];
        String[] xepLoai = new String[soHs];

        for (int i = 0; i < soHs; i++){
            System.out.println("Học sinh số : "+ (i+1));

            System.out.println("Nhập tên học sinh: ");
            ten[i] = sc.nextLine();
            System.out.println("Nhập điểm hoc sinh: ");
            diem[i] = sc.nextDouble();
            sc.nextLine();
        }
        int chon;

        do {
            System.out.println("======== MENU ========");
            System.out.println("CN1 : In danh sách kèm xếp loại");
            System.out.println("CN2 : Tìm học sinh theo tên ");
            System.out.println("CN3 : In học sinh điểm cao nhất/thấp nhất");
            System.out.println("CN4 : Sắp xếp danh sách theo điểm giảm dần ");
            System.out.println("CN5 : Thống kê số lượng theo từng xếp loại");
            System.out.println("CN6 : Thoát");
            System.out.print("Chọn chức năng : ");

            chon = sc.nextInt();

            switch (chon){
                case 1 -> {
                    System.out.println("Chức năng 1");
                    for (int i = 0; i < soHs; i++){
                        System.out.println("Tên học sinh:"+ ten[i]);
                        System.out.println("Điểm của học sinh:"+ diem[i]);
                        if (diem[i] < 0 || diem[i] >10){
                            System.out.println("Nhâp sai");
                            return;
                        }
                        if ( diem[i] >=8){
                            System.out.println(xepLoai[i] = "Giỏi");
                        } else if (diem[i] >= 6.5 ) {
                            System.out.println(xepLoai[i] = "Khá");
                        } else if (diem[i] >=5 ) {
                            System.out.println(xepLoai[i] = "Trung bình");
                        }else {
                            System.out.println(xepLoai[i] = "Yếu");
                        }
                    }
                }
                case 2 -> {
                    System.out.println("Chức năng 2");
                    System.out.println("Tìm học sinh theo tên");
                    sc.nextLine();
                    System.out.print("Nhập tên muốn tìm : ");
                    String search = sc.nextLine();
                    boolean tim = false;
                    for (int i = 0; i < soHs; i++){
                        if (search.equalsIgnoreCase(ten[i])){
                            System.out.println("Đã tìm thấy học sinh");
                            System.out.println("Tên học sinh:"+ ten[i]);
                            System.out.println("Điểm của học sinh:"+ diem[i]);
                            System.out.println(xepLoai[i]);

                            tim = true;
                            break;

                        }

                        }
                    if (!tim){
                        System.out.println("Không tìm thấy học sinh");
                    }
                }
                case 3 -> {
                    System.out.println("Chức năng 3");
                    System.out.println("In học sinh điểm cao nhất thấp nhất");
                    double diemMax = diem[0];
                    double diemMin = diem[0];
                    int viTriMax = 0;
                    int viTriMin = 0;
                    for (int i = 1; i < soHs; i++){
                        if (diemMax < diem[i]){
                            diemMax = diem[i];
                            viTriMax = i;
                        }
                        if (diemMin > diem[i]){
                            diemMin = diem[i];
                            viTriMin = i;
                        }

                    }
                    System.out.println("Học sinh điểm thấp nhất là : "+ ten [viTriMin]);
                    System.out.println("Học sinh điểm cao nhất là : "+ ten[viTriMax]);



                }
                case 4 -> {
                    System.out.println("Chức năng 4");
                    System.out.println("Sắp xếp danh sách theo điểm giảm dần ");
                    for (int i = 0; i < soHs - 1; i++) {
                        for (int j = i + 1; j < soHs; j++) {
                            if (diem[i] < diem[j]) {
                                // Đổi chỗ điểm
                                double luuDiem = diem[i];
                                diem[i] = diem[j];
                                diem[j] = luuDiem;
                                // Đổi chỗ tên
                                String luuTen = ten[i];
                                ten[i] = ten[j];
                                ten[j] = luuTen;
                            }
                        }
                    }// sohs=3 diem123 i=0 j=1 ->213
                    //i=0 j=2 ->312 -> i=1 j=2 ->321
                    //diem 132 -> i=0 j=1 ->312 -> i=0 j=2 ->không chạy vì diem[3]>diem[2]
                    // i=1 j=2->321
                    System.out.println("Đã sắp xếp giảm dần!");
                    for (int i = 0; i < soHs; i++) {
                        System.out.println(
                                "Tên: " + ten[i] + " - Điểm: " + diem[i]
                        );
                    }
                }
                case 5 -> {
                    System.out.println("Chức năng 5");
                    System.out.println("Thống kê số lượng theo từng xếp loại");

                    int demGioi = 0;
                    int demKha = 0;
                    int demTrungBinh = 0;
                    int demYeu = 0;

                    for (int i = 0; i < soHs; i++) {

                        if (xepLoai[i].equals("Giỏi")) {
                            demGioi++;
                        } else if (xepLoai[i].equals("Khá")) {
                            demKha++;
                        } else if (xepLoai[i].equals("Trung bình")) {
                            demTrungBinh++;
                        } else if (xepLoai[i].equals("Yếu")) {
                            demYeu++;
                        }
                    }

                    System.out.println("Số lượng học sinh loại Giỏi: " + demGioi);
                    System.out.println("Số lượng học sinh loại Khá: " + demKha);
                    System.out.println("Số lượng học sinh loại Trung bình: " + demTrungBinh);
                    System.out.println("Số lượng học sinh loại Yếu: " + demYeu);
                }
                case 6 -> {
                    System.out.println("Thoát MENU");
                }
            }
        }while (chon != 6);
    }
}
