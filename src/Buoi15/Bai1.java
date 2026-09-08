package Buoi15;
//1.Từ List<Product>: lọc sản phẩm quantity < 5 (sắp hết hàng) bằng stream,
// so sánh code với phiên bản for-each buổi 11.
//2.Tính tổng giá trị kho bằng mapToDouble().sum().
//3.Lấy danh sách tên sản phẩm, viết hoa toàn bộ, sắp theo alphabet: map + sorted + toList.
//4.Tìm sản phẩm đắt nhất bằng max(Comparator.comparing(...)) — trả về Optional<Product> .
//5.Đếm số sản phẩm giá trên 1 triệu bằng filter + count.
//6.Kiểm tra "có sản phẩm nào hết hàng không" bằng anyMatch; "tất cả đều còn hàng?" bằng allMatch.
//9.	Sắp xếp List<Product> theo giá giảm dần rồi lấy top 3 (sorted + limit).
import java.util.*;

class Product{
    String name;
    int quantity;
    double price;

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Name "+ name + " - " + "Quantity "+ quantity + " - " + "Price "+ price;
    }
}
public class Bai1 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Cung", 1, 2000000));
        products.add(new Product("Báo", 3,3000000));
        products.add(new Product("Lam", 6,500));
        products.add(new Product("Kính", 0,100));
        products.add(new Product("Quần", 0,100));
        List<Product> sapHetHang = products.stream()
                .filter(p -> p.quantity < 5)//Với mỗi Product p → kiểm tra quantity của p có nhỏ hơn 5 không.
                .toList();
        System.out.println(sapHetHang);
//        for (Product p : products){
//            if (p.quantity < 5){
//                System.out.println(p);
//            }
//        }
        System.out.println("------------------------------------");

        //bai2
        double tong = products.stream()
                .mapToDouble(p -> p.quantity * p.price)//Với mỗi Product p → lấy quantity nhân price để tạo ra một số.
                .sum();
        System.out.println("tổng giá trị kho "+ tong);
        System.out.println("------------------------------------");

        //bai3
        List<String> names = products.stream()
                .map(p -> p.name.toLowerCase())//với mỗi Product p -> lấy name của p rồi chuyển thành chữ hoa
                .sorted()
                .toList();
        System.out.println(names);
        System.out.println("------------------------------------");

        //bai4
        Optional<Product> maxPrice = products.stream()
                .max(Comparator.comparing(Product ::getPrice));//Method reference
        //Với mỗi Product p → lấy price của p làm giá trị để so sánh.
        System.out.println("Sản phẩm đắt nhất " + maxPrice);
        System.out.println("------------------------------------");

        //bai5
        long count = products.stream()
                .filter(p -> p.price > 1000000)
                .count();
        System.out.println("Số sản phẩm giá trên 1 triệu "+count);

        System.out.println("------------------------------------");
        //bai6
        boolean hetHang = products.stream()
                .anyMatch(p -> p.quantity == 0 );
        System.out.println("Có sản phẩm hết hàng  " + hetHang);
        boolean hang = products.stream()
                .allMatch(p -> p.quantity > 0 );
        System.out.println("Tất c đều còn hàng  " + hang);

        System.out.println("------------------------------------");
        //bai9
        List<Product> xep = products.stream()
                .sorted(Comparator.comparing((Product p) -> p.price).reversed())
                .limit(3)
                .toList();
        System.out.println(xep);
        List<Product> lonHon10 = products.stream()
                .filter(p -> {
                    if (p.quantity > 10) {
                        return true;
                    } else {
                        return false;
                    }
                })
                .toList();
        System.out.println("Sản phẩm lớn hơn 10"+ lonHon10);

    }
}
