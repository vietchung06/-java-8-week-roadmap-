package Buoi15;

import java.util.*;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> so =new ArrayList<>();
        System.out.println("Nhập số nguyên (Nhập 0 để dừng):");
        while (true){
            int s = sc.nextInt();
            if (s == 0){
                break;
            }
            so.add(s);
        }
        System.out.println(so);
        int tong = so.stream()
                .mapToInt(Integer::intValue)//lấy Integer → int
                .sum();
        Optional<Integer> max = so.stream()
                .max(Integer::compareTo);
        Optional<Integer> min = so.stream()
                .min(Integer::compareTo);
        List<Integer> xep = so.stream()
                        .sorted()
                        .toList();
        System.out.println(xep);
        System.out.println("Tổng: "+ tong);
        System.out.println("Max: "+ max);
        System.out.println("Min: "+ min);

    }
}
