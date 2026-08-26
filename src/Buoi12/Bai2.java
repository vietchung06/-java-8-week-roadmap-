package Buoi12;

import java.util.HashMap;
import java.util.Optional;

//2.	Dùng HashMap<Integer, Product> lưu sản phẩm theo id, viết findById(int id)
class Product {
    String name;
    int id;
    double price;

    public Product(int id, String name, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID : "+ id + " "+ "Name : "+ name+ " "+ "Price : "+price;

    }
}
public class Bai2 {
    static  HashMap<Integer, Product> products = new HashMap<>();
//    public static Product findById(int id) {
//        return products.get(id);
//    }

    // Tìm sản phẩm theo id
    public static Optional<Product> findById(int id) {//Hàm này có thể tìm thấy Product cũng có thể không tìm thấy
        return Optional.ofNullable(products.get(id));
     //ofNullable() = nhận một giá trị có thể null; nếu có dữ liệu thì cho vào Optional, nếu null thì tạo Optional.empty()
    }//tìm product theo ID nếu có Product -> Optional[Product] nếu null -> Optional.empty()
    public static void main(String[] args) {
        products.put(101, new Product(101, "Laptop", 15000000));
        products.put(102, new Product(102, "Chuột", 300000));
        products.put(103, new Product(103, "Bàn phím", 500000));
        Product product = findById(104).orElseThrow() ;
        //products.get(104) -> null -> Optional.empty() -> orElseThrow()-báo lỗi
        System.out.println(product);


    }
}
