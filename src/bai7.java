import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập chiều cao:");
        double chieucao=sc.nextDouble();
        System.out.println("NHahapal cân nặng:");
        double cannang=sc.nextDouble();

        double BMI=cannang/(chieucao*chieucao);
        System.out.println("BMI:"+BMI);
    }
}
