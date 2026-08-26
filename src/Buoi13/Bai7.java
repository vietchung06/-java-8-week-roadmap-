package Buoi13;
//7.	Cố tình gây lỗi NullPointerException bằng cách gọi method trên biến null, đọc stack trace,
// rồi sửa bằng Optional
import java.util.Optional;

public class Bai7 {
    public static void main(String[] args) {
        String name = null;
        Integer score = null;
//        System.out.println(score.doubleValue());
//        System.out.println(name.length());
        Optional<String> n = Optional.ofNullable(name);
        Optional<String> s = Optional.ofNullable(name);
        String ktra = n.orElse("Không có tên");
// Nếu Optional có giá trị → lấy giá trị đó. Nếu không có → dùng giá trị mặc định tôi cung cấp.
        System.out.println(s);
        System.out.println(ktra);


    }
}
