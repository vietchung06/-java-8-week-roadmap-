package Buoi5;

import java.util.Arrays;
import java.util.Scanner;
//4.	Sắp xếp mảng tăng dần bằng Bubble Sort (lồng 2 vòng for);
// sau đó thử Arrays.sort() và so sánh.
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("a[" + i + "] = " );
            a[i] = sc.nextInt();
        }

        int[] b = Arrays.copyOf(a, a.length);

        for (int i = 0; i < n - 1; i++) {// đếm số lượt sắp xếp
            for (int j = 0; j < n - 1 - i; j++) {// j dùng để đi qua từng cặp số đứng cạnh nhau
                if (a[j] > a[j + 1]) {//nếu bên trái > phải đổi chỗ 2 số
                    int luu = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = luu;
                }
            }
        }

        System.out.println("Mảng sau khi sắp xếp tăng dần:");

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\n");
        Arrays.sort(b);

        System.out.println("Arrays.sort():");
        System.out.println(Arrays.toString(b));

    }
}
