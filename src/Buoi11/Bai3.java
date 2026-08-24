package Buoi11;
//3.	Viết method removeAllOutOfStock(List<Product> list) xóa mọi sản phẩm quantity == 0
//dùng Iterator
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Product3 {
    private String name;
    private double price;
    private int quantity;

    Product3 (String name, double price, int quantity){
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

public class Bai3 {
    public static void removeAllOutOfStock(List<Product3> list){
        Iterator<Product3> iterator = list.iterator();//khai báo một Iterator
        while (iterator.hasNext()){  //Phương thức hasNext sẽ duyệt qua từng phần tử trong tập hợp
            // cho đến khi đi tới phần tử cuối cùng của tập hợp.Hàm while sẽ chạy hết các phần tử trong tập hợp.
            // Nếu chúng ta muốn lấy phần tử ra thì sử dụng phương thức next()
            Product3 product = iterator.next();
            if (product.getQuantity()==0){
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        List<Product3> p = new ArrayList<>();
        p.add(new Product3("Áo", 150000, 10));
        p.add(new Product3("Quần", 200000, 0));
        p.add(new Product3("Mũ", 50000, 5));
        p.add(new Product3("Giày", 300000, 0));

        System.out.println("Danh sách ban đầu:");

        for (Product3 product : p) {
            product.display();
        }
        removeAllOutOfStock(p);
        System.out.println("\nDanh sách sau khi xóa:");

        for (Product3 product : p) {
            product.display();
        }

    }
}
