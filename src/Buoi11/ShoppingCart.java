package Buoi11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class CartItem {
   private String product;
   private double price;
   private int quantity;

    public CartItem(String product, double price, int quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double soTien(){
        return getPrice() * getQuantity();
    }

}
class Cart {
    List<CartItem> items = new ArrayList<>();
    public void addItems(String product, double price, int quantity){
        for (CartItem item : items){
            if (item.getProduct().equalsIgnoreCase(product)){
                item.setQuantity(item.getQuantity()+ quantity);
                System.out.println("Sản phẩm đã có cộng thêm số lượng");
                return;
            }
        }
        items.add(new CartItem(product, price, quantity));
        System.out.println("Đã thêm sản phẩm mới");
    }
    public void removeItems(String product){
        for (int i = 0; i < items.size(); i++){
            if (items.get(i).getProduct().equalsIgnoreCase(product));
            items.remove(i);
            System.out.println("Đã xóa sản phẩm");
            return;
        }
    }
    public void printReceipt(){
        if (items.isEmpty()){
            System.out.println("Chưa có hóa đơn nào");
            return;
        }
        for (CartItem cartItem : items){

            System.out.println("Tên :  " + cartItem.getProduct());
            System.out.println("Giá : " + cartItem.getPrice());
            System.out.println("Số lượng : " + cartItem.getQuantity());
            System.out.println("Số tiền sản phẩm: "+cartItem.soTien());
        }
    }
    public void updateQuantity(String product, int quantity){
        for (CartItem item : items){
            if (item.getProduct().equalsIgnoreCase(product)){
                item.setQuantity(quantity);
            }
        }
    }
    public void getTotal(){
        double tongTien =0;
        for (CartItem item : items){
            tongTien += item.soTien();
            System.out.println("Tên : "+ item.getProduct());
            System.out.println("Số tiền sản phẩm: "+item.soTien());
        }
        System.out.println("Tổng tiền : "+ tongTien);

    }


}
public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cart cart = new Cart();
        int chon = 0;
        do {
            System.out.println("=============");
            System.out.println("CN1 : Thêm sản phẩm");
            System.out.println("CN2 : Xóa sản phẩm");
            System.out.println("CN3 : Cập nhật số lượng");
            System.out.println("CN4 : Xem giỏ hàng");
            System.out.println("CN5 : Tính tổng tiền");
            System.out.println("0 : Thoát");
            System.out.println("Nhập chức năng muốn chọn");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon){
                case 1 -> {

                    System.out.println("Chức năng 1");
                    System.out.println("Nhập tên sản phẩm : ");
                    String name = sc.nextLine();
                    System.out.println("Nhập giá : ");
                    double price = sc.nextDouble();
                    System.out.println("Nhập số lượng : ");
                    int quantity = sc.nextInt();
                    cart.addItems(name, price, quantity);
                }
                case 2 -> {

                    System.out.println("Chức năng 2");
                    System.out.println("Nhập tên muốn xóa : ");
                    String name = sc.nextLine();
                    cart.removeItems(name);

                }
                case 3 -> {
                    System.out.println("Chức năng 3");
                    System.out.println("Nhập tên sản phẩm : ");
                    String name = sc.nextLine();
                    System.out.println("Nhập số lượng muốn thay đổi : ");
                    int quantity = sc.nextInt();
                    cart.updateQuantity(name, quantity);
                }
                case 4 -> {
                    System.out.println("Chức năng 4");
                    cart.printReceipt();
                }
                case 5 -> {
                    System.out.println("Chức năng 5");

                    cart.getTotal();
                }
                case 0 -> {
                    System.out.println("Thoát");
                }
                default -> {
                    System.out.println("Chọn số không đúng");
                }
            }

        }while (chon != 0);
    }
}
