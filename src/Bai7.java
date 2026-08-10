import java.util.Scanner;
//Tính chỉ số BMI bằng cách nhập từ bàn phím
public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều cao:");
        double chieuCao = sc.nextDouble();
        System.out.println("NHahapal cân nặng:");
        double canNang = sc.nextDouble();

        double BMI = canNang / (chieuCao*chieuCao);
        System.out.println("BMI:"+ BMI);
    }
}
