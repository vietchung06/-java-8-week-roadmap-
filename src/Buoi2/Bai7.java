package Buoi2;

import java.util.Scanner;
//công thức tính lãi ngaan hàng lãi kép
//A = P (1 + r/n)^(nt)
//
//Trong đó:
//
//A: Số tiền cuối cùng sau khi tính lãi.
//P: Số tiền gốc ban đầu (số tiền gửi).
//r: Lãi suất hàng năm (dưới dạng thập phân).
//n: Số lần lãi được tính trong một năm.
//t: Thời gian gửi tiền (tính bằng năm).
public class Bai7 {
    //tính số tiê ửi lãi gửi tiết kiệm sau 1 năm và 2 năm lãi xuất 5%
    //công thức bài lãi 1 năm A = P (1 + r)
    // lãi 2 năm A = p (1+r)^2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi tiết kiệm");
        int tienGui = sc.nextInt();
        System.out.println("Nhập số lãi xuất");
        double laiSuatNam = sc.nextDouble();
        double tongTienLai1Nam = tienGui * (1 + (laiSuatNam /100));
        System.out.println("Tổng tiền lãi 1 năm:"+ tongTienLai1Nam);
        double tongTienLai2Nam = tienGui * Math.pow(1 + (laiSuatNam/100),2);
        System.out.println("Tổng tiền lãi 2 năm :"+ tongTienLai2Nam);


    }
}
