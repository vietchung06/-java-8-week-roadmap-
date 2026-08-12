package Buoi4;
//dùng while vaf for + continue tính tổng từ 1->100 và tổng các số chẵn
public class Bai2 {
    public static void main(String[] args) {
        int sum = 0;
//        int n = 1;
//        while (n <= 100){
//            sum += n;
//            n++;
//
//        }
//        System.out.println("Tổng 1->100 ="+ sum);
        for(int i = 1; i <= 100; i++){
            if(i % 2 != 0){
                continue;
            }
            sum += i;

        }
        System.out.println("Tổng các số chẵn="+ sum);
    }
}
