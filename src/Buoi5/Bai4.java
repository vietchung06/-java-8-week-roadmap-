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
//co 4 phần tử 4321 -> i<3 chạy
// lần 1 i=0 -> j<4-1-0 -> j<3 ->
// lần 1 j=0  a[0] ss a[1] số lớn hơn sẽ sang a[1]
//->lan2 j=1  a[1] ss a[2]->lan3 j=2 a[2] ss a[3] -> lan4 j=0 thoát vòng lặp
//i lan 2 i=1 ->j<2 ->lan1 j=0 -> a[0] ss a[1] -> lan2 j=1 a[1] ss a[2] -> j=3 thoát lặp
//i lan 3 i=2 ->j<1 ->lan1 j=0 -> a[0] ss a[1] -> lan2  thoắt lặp
//i lan 4 i=3 -> thoát i
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
