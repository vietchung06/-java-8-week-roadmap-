package Buoi4;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int soBiMat = (int)(Math.random() * 100);
        int dem = 0;

        while (true){
            System.out.println("Nhập số bạn đoán:");
            int so = sc.nextInt();
            dem++;
            if(so > soBiMat){
                System.out.println("Số bí mật nhỏ hơn");
            } else if (so < soBiMat){
                System.out.println("Số bí mật lớn hơn");
            }else {
                System.out.println("Bạn đã chọn đúng");
                break;
            }

        }
        System.out.println("Số lần đoán: "+ dem);
    }
}
