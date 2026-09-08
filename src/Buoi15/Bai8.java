package Buoi15;

import java.util.ArrayList;
import java.util.List;

//8.	Từ List<Integer> 1-100: lọc số chẵn, bình phương từng số, tính tổng — 1 chuỗi stream duy nhất.
public class Bai8 {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        for (int i = 1; i <= 100; i++){
            number.add(i);
        }
        int tong = number.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n * n)
                .sum();
        System.out.println(tong);
    }


}
