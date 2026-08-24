package Buoi11;
//4.	Nhập danh sách số nguyên đến khi nhập 0 (bài 12 buổi 4),
// lưu vào List<Integer>, in tổng/max/min
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> number =new ArrayList<>();
        System.out.println("Nhập các số nguyên (Nhập 0 để dừng) : ");
        while (true){
            int n = sc.nextInt();
            if (n==0){
                break;
            }
            number.add(n);
        }
        int sum = 0;
        for (int i = 0; i < number.size(); i++){
            sum += number.get(i);
        }
        int max = number.get(0);
        int min = number.get(0);
        for (Integer n : number){
            if (n > max){
                max = n;
            }
            if (n < min){
                min = n;
            }
        }
        System.out.println("Danh sách"+ number);
        System.out.println("Tổng : "+sum);
        System.out.println("Max : "+ max);
        System.out.println("Min : "+ min);


    }
}
