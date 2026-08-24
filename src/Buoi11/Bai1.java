package Buoi11;

//1.	Chuyển bài quản lý sản phẩm (tuần 2) từ mảng sang List<Product>:
// thêm, xóa theo tên, sửa giá theo tên.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
   private String name;
   private double price;
   private int quantity;

    Product (String name, double price, int quantity){
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

    double getTotalValue(){
        return price * quantity;
    }

}
public class Bai1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Product> products =new ArrayList<>();

        products.add(new Product("áo", 10,20) );
        products.add(new Product("quần", 20,30) );
        products.add(new Product("mũ", 30,40) );

        System.out.println("Nhập tên cần xóa : ");
        String name = sc.nextLine();
        for (int i = 0; i < products.size(); i++){
            if (products.get(i).getName().equalsIgnoreCase(name)){
                products.remove(i);
                System.out.println("Đã xóa sản phẩm");

            }
        }
        System.out.println("\nDanh sách sau khi sửa:");

        for (Product product : products) {
            System.out.println(
                    "Tên: " + product.getName()
                            + " | Giá: " + product.getPrice()
                            + " | Số lượng: " + product.getQuantity()
            );
        }

        System.out.println("Nhập tên sản phẩm cần sửa giá : ");
        String n = sc.nextLine();
        System.out.println("Nhập giá mới : ");
        double giaMoi = sc.nextDouble();
        for (int i = 0; i < products.size(); i++){
            if (products.get(i).getName().equalsIgnoreCase(n)){
                products.get(i).setPrice(giaMoi);
                System.out.println("Đã sửa giá sản phẩm");


            }
        }
        for (Product product2 : products) {
            System.out.println(
                    "Tên: " + product2.getName()
                            + " | Giá: " + product2.getPrice()
                            + " | Số lượng: " + product2.getQuantity()
            );
        }



        }

    }




