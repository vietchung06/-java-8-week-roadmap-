package Buoi5;

import java.util.Scanner;

//11.	Mảng 2 chiều: nhập ma trận điểm 3 học sinh × 4 môn, in bảng điểm,
// tính trung bình từng học sinh (theo hàng) và từng môn (theo cột).
public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hs = 3;
        int mon = 4;
        double [][] diem = new double[hs][mon];
        for (int i = 0; i < hs; i++){
            System.out.println("Nhập điểm cho học sinh "+ (i+1) + " ");
            for (int j = 0; j < mon; j++){
                System.out.println("Môn "+ (j+1) + ": ");
                diem[i][j] = sc.nextDouble();
            }
        }
        for (int i = 0; i < hs; i++){
            for (int j = 0; j < mon; j++){
                System.out.println( diem[i][j] +"\t" );

            }
            System.out.println();
        }
        for (int i = 0; i < hs; i++){
            double tong = 0;
            for (int j = 0; j < mon; j++){
                tong += diem[i][j];

            }
            double diemTb = tong / mon;
            System.out.println("Điểm trung bình hs " + (i + 1) + " = "+ diemTb);
        }

    }
}
