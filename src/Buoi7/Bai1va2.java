package Buoi7;
class Product{
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
    double getTotalValue(){
        return price * quantity;
    }
}
public class Bai1va2 {
    public static void main(String[] args) {
        Product products = new Product("Xe", 10, 20);
        System.out.println("Thông tin sản phẩm :");
        System.out.println("Tên : "+ products.getName());
        products.setPrice(-1);
        System.out.println("Giá : "+ products.getPrice());
        products.setQuantity(-1);
        System.out.println("Số lượng : "+ products.getQuantity());
        System.out.println("Tổng tiền : "+ products.getTotalValue());
    }

}
