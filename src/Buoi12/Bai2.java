package Buoi12;

import java.util.HashMap;

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
    public static Product findById(int id) {
        return products.get(id);
    }
    public static void main(String[] args) {
        products.put(101, new Product(101, "Laptop", 15000000));
        products.put(102, new Product(102, "Chuột", 300000));
        products.put(103, new Product(103, "Bàn phím", 500000));
        Product product = findById(103);
        System.out.println(product);


    }
}
