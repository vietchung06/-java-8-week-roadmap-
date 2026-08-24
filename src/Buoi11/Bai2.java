package Buoi11;
//2.	Lọc ra danh sách sản phẩm giá > 100.000đ từ List<Product>
// (for-each + if), trả về một List<Product> mới.
import java.util.ArrayList;
import java.util.List;

class Product2 {
    private String name;
    private double price;
    private int quantity;

    Product2 (String name, double price, int quantity){
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
public class Bai2 {
    public static void main(String[] args) {
        List<Product2> product =new ArrayList<>();

        product.add(new Product2("áo", 150000,20) );
        product.add(new Product2("quần", 200000,30) );
        product.add(new Product2("mũ", 30,40) );
        System.out.println("List 1");
        for (Product2 lst1 : product){

            lst1.display();
        }
        System.out.println("List 2");
        List<Product2> lst2 = new ArrayList<>();
        for (Product2 p : product){
            if (p.getPrice() > 100000){
                lst2.add(p);
            }
        }
        for (Product2 p : lst2){
            p.display();
        }

    }
}
