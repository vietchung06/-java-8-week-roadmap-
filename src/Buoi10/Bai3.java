package Buoi10;
//3.	Interface Discountable với applyDiscount(double percent);
// class Product (buổi 7) implement — 1 class vừa có cha vừa có nhiều "khả năng".


interface Discountable {
     void applyDiscount(double percent);
}
class Product implements Discountable{
    private String name;
    private double price;
    private int quantity;

    public Product (String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price >= 0){
            this.price = price;
        }else {
            System.out.println("Giá phải >= 0 ");
        }

    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0){

            this.quantity = quantity;
        }else {
            System.out.println("Số lượng phải >= 0 ");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void applyDiscount(double percent) {
         price = price - price * percent;
    }
}
public class Bai3 {
    public static void main(String[] args) {
        Product p =new Product("oto", 1000,10);
        System.out.println("Tên : "+ p.getName());
        System.out.println("Giá trước giảm : "+ p.getPrice());
        System.out.println("So lượng : "+ p.getQuantity());

        p.applyDiscount(0.1);
        System.out.println("Giá sau giảm : " + p.getPrice());


    }
}
