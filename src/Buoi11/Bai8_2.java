package Buoi11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Products {
    private String name;
    private double price;
    private int quantity;

    public Products(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
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

    public void display() {
        System.out.println(
                "Tên: " + name +
                        " | Giá: " + price +
                        " | Số lượng: " + quantity
        );
    }
}

public class Bai8_2 {
    public static void main(String[] args) {

        List<Products> products = new ArrayList<>();

        products.add(new Products("Áo", 150000, 20));
        products.add(new Products("Quần", 200000, 30));
        products.add(new Products("Mũ", 50000, 40));

        System.out.println("Trước khi sắp xếp:");

        for (Products product : products) {
            product.display();
        }

        // Sắp xếp theo giá tăng dần
        products.sort(
                Comparator.comparing(Products::getPrice)
        );

        System.out.println("\nSau khi sắp xếp:");

        for (Products product : products) {
            product.display();
        }
    }
}