package Buoi11;
//7.	Loại bỏ phần tử trùng lặp trong List<Integer> không dùng Set
//Set tự động không cho phép phần tử trùng nhau.
import java.util.ArrayList;
import java.util.List;

public class Bai7 {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>(List.of(1,3,5,7,1,7,8,3));
        List<Integer> ketQua =new ArrayList<>();
        for (Integer n : number){
            if (!ketQua.contains(n)){// ketQua đã có số n hay chưa nếu chưa có thì thêm vào
                ketQua.add(n);
            }
        }
        System.out.println("Danh sách ban đầu : "+ number);
        System.out.println("Danh sách sau khi lọc : "+ ketQua);

    }
}
