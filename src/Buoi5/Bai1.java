package Buoi5;

import java.util.Scanner;
//1.	Nhập mảng n số nguyên, tìm max, min và vị trí của chúng.
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n:");
        int n = sc.nextInt();

        int [] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
        // Ban đầu coi phần tử đầu tiên là max và min
        int max = a[0];
        int min = a[0];

        int viTriMax = 0;
        int viTriMin = 0;

        // Duyệt mảng để tìm max, min
        for (int i = 1; i < n; i++) {//1234->a0=1 a1=2
            if (a[i] > max) {
                max = a[i];
                viTriMax = i;
            }

            if (a[i] < min) {
                min = a[i];
                viTriMin = i;
            }
        }


        System.out.println("Max = " + max);
        System.out.println("Vi tri max = " + viTriMax);

        System.out.println("Min = " + min);
        System.out.println("Vi tri min = " + viTriMin);

    }
}
