package Buoi11;
//5.	Viết method findByName(List<Product> list, String keyword)
// trả về mọi sản phẩm tên chứa keyword (không phân biệt hoa thường).
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Product4 {
    private String name;
    private double price;
    private int quantity;

    Product4 (String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void display() {
        System.out.println(
                "Tên: " + name +
                        " | Giá: " + price +
                        " | Số lượng: " + quantity
        );
    }

    double getTotalValue(){
        return price * quantity;
    }

}
public class Bai5 {


    public static List<Product4> findByName(
            List<Product4> list,
            String keyword) {

        List<Product4> result = new ArrayList<>();//tạo danh sách kết quả.

        for (Product4 product : list) {

            if (product.getName()
                    .toLowerCase()
                    .contains(keyword.toLowerCase())) {//kiểm tra tên có chứa từ khóa, không phân biệt hoa thường.

                result.add(product);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Product4> products =new ArrayList<>();

        products.add(new Product4("Laptop Gaming", 1500000, 2));
        products.add(new Product4("Chuột Logitech", 500000, 5));
        products.add(new Product4("Bàn phím Gaming", 800000, 3));
        products.add(new Product4("Tai nghe", 1000000, 4));
        List<Product4> result = findByName(products, "gaming");

        for (Product4 product : result) {
            product.display();
        }





    }
}



