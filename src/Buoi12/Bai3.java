package Buoi12;
//3.	Loại bỏ trùng lặp bài 7 hôm qua bằng: new HashSet<>(list).
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Bai3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(1);
        list.add(3);
        list.add(7);
        list.add(5);
        list.add(8);
        Set<Integer> ketQua = new HashSet<>(list);//Tạo một HashSet mới và đưa tất cả phần tử của list vào.
        System.out.println("Danh sách ban đầu : "+ list);
        System.out.println("Danh sách sau khi lọc : "+ ketQua);

    }
}
