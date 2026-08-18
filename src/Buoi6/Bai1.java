package Buoi6;

class Product {
    String name;
    double price;
    int quantity;

    Product (String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    double getTotalValue(){
        return price * quantity;
    }

}
public class Bai1 {
    public static void main(String[] args) {
        Product [] products = {
          new Product ("Áo", 10, 20),
                new Product("Kính", 20, 30),
                new Product("Quần", 15, 25),
                new Product("Váy", 6, 8),
                new Product("Giày", 56, 2),
        };
        for (int i = 0; i < products.length; i++){
            System.out.println("Thông tin sản phẩm :");
            System.out.println("Tên : "+ products[i].name);
            System.out.println("Giá : "+ products[i].price);
            System.out.println("Số lượng : "+ products[i].quantity);
            System.out.println("Tổng tiền : "+ products[i].getTotalValue());
        }

    }
}
