package Buoi14;
//3.	Tạo InvalidPriceException, ném trong setter setPrice() khi giá âm —

class InvalidPriceException extends RuntimeException {
    public InvalidPriceException(String message) {
        super(message);
    }
}

// Product
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new InvalidPriceException("Giá không được âm");
//            System.out.println("Giá không đuợc âm");
//            return;
        }

        this.price = price;
    }

    @Override
    public String toString() {
        return "Tên: " + name + " - Giá: " + price;
    }
}

public class Bai3 {
    public static void main(String[] args) {

        Product p = new Product("Áo", 1);

        System.out.println("Ban đầu:");
        System.out.println(p);
//        p.setPrice(-1);
//        System.out.println("Sau khi sửa");
//        System.out.println(p);
        try {
            p.setPrice(-1);
        } catch (InvalidPriceException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Sau khi sửa");
        System.out.println(p);


    }
}
