package Buoi6;

import java.util.Scanner;

class Student {
    String name;
    double score;

    public Student(String name, double score){
        this.name = name;
        this.score = score;

    }
    String getRank(){
        if ( score >=8){
            return "Giỏi";
        } else if (score >= 6.5 ) {
            return "Khá";
        } else if (score >=5 ) {
            return "Trung Bình";
        }else {
            return "Yếu";
        }
    }
}
public class QuanLyDiemOOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhâp số lượng học sinh");
//        int soHs = sc.nextInt();
//        sc.nextLine();

       Student [] students = {
               new Student("An", 3.5),
               new Student("Bình", 7.0),
               new Student("Cường", 9.0),
               new Student("Dũng", 5.5)
       };
       int soHs = students.length;

//        for (int i = 0; i < soHs; i++){
//            System.out.println("Học sinh số : "+ (i+1));
//            System.out.println("Nhập tên hs : ");
//            String name = sc.nextLine();
//            System.out.println("Nhập điểm học sinh : ");
//            int score = sc.nextInt();
//            sc.nextLine();
//            students[i] = new Student(name, score);
//
//        }
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
                        System.out.println("Tên hs : "+ students[i].name);
                        System.out.println("Điểm hs : "+ students[i].score);
                        System.out.println("Xếp loại : "+ students[i].getRank());
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
                        if (search.equalsIgnoreCase(students[i].name)){
                            System.out.println("Đã tìm thấy học sinh");
                            System.out.println("Tên học sinh:"+ students[i].name);
                            System.out.println("Điểm của học sinh:"+ students[i].score);
                            System.out.println(students[i].getRank());

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
                    double diemMax = students[0].score;
                    double diemMin = students[0].score;
                    int viTriMax = 0;
                    int viTriMin = 0;
                    for (int i = 1; i < soHs; i++){
                        if (diemMax < students[i].score){
                            diemMax = students[i].score;
                            viTriMax = i;
                        }
                        if (diemMin > students[i].score){
                            diemMin = students[i].score;
                            viTriMin = i;
                        }

                    }
                    System.out.println("Học sinh điểm thấp nhất là : "+ students [viTriMin].name);
                    System.out.println("Học sinh điểm cao nhất là : "+ students[viTriMax].name);



                }
                case 4 -> {
                    System.out.println("Chức năng 4");
                    System.out.println("Sắp xếp danh sách theo điểm giảm dần ");
                    for (int i = 0; i < soHs - 1; i++) {
                        for (int j = i + 1; j < soHs; j++) {
                            if (students[i].score < students[j].score) {
                                // Đổi chỗ object kèm cả tên cả điểm
                                Student luuDiem = students[i];
                                students[i] = students[j];
                                students[j] = luuDiem;


                            }
                        }
                    }// sohs=3 diem123 i=0 j=1 ->213
                    //i=0 j=2 ->312 -> i=1 j=2 ->321
                    //diem 132 -> i=0 j=1 ->312 -> i=0 j=2 ->không chạy vì diem[3]>diem[2]
                    // i=1 j=2->321
                    System.out.println("Đã sắp xếp giảm dần!");
                    for (int i = 0; i < soHs; i++) {
                        System.out.println(
                                "Tên: " + students[i].name + " - Điểm: " + students[i].score
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

                        if (students[i].getRank().equals("Giỏi")) {
                            demGioi++;
                        } else if (students[i].getRank().equals("Khá")) {
                            demKha++;
                        } else if (students[i].getRank().equals("Trung bình")) {
                            demTrungBinh++;
                        } else if (students[i].getRank().equals("Yếu")) {
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
