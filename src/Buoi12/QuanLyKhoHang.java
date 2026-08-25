package Buoi12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Products {
    private String sku;
    private  String name;
    private  double price;
    private  int quantity;

    public Products(String sku,String name, double price,  int quantity) {
        this.sku = sku;
        this.price = price;
        this.name = name;
        this.quantity = quantity;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
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

    @Override
    public String toString() {
        return sku + " - " + name
                + " - Giá: " + price
                + " - SL: " + quantity;
    }
}
public class QuanLyKhoHang {
    static Map<String, Products> kho = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int chon;
        do {
            System.out.println("\n========== QUẢN LÝ KHO ==========");
            System.out.println("1. Nhập kho");
            System.out.println("2. Xuất kho");
            System.out.println("3. Tra cứu sản phẩm theo SKU");
            System.out.println("4. Cảnh báo sản phẩm sắp hết");
            System.out.println("5. Báo cáo tổng giá trị kho");
            System.out.println("6. In toàn bộ sản phẩm");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon){
                case 1 -> {
                    System.out.println("Chức năng 1");
                    System.out.print("Nhập SKU mốn thêm : ");
                    String sku = sc.nextLine();
                    if (kho.containsKey(sku)){
                        System.out.println("Mã đã tồn tại ");
                        Products products = kho.get(sku);
                        System.out.print("Nhập số lượng muốn thêm : ");
                        int quantity = sc.nextInt();
                        products.setQuantity(products.getQuantity() + quantity);

                    }else {
                        System.out.print("Nhập tên muốn thêm : ");
                        String name = sc.nextLine();
                        System.out.print("Nhập giá muốn thêm : ");
                        double price = sc.nextDouble();
                        System.out.print("Nhập số lượng muốn thêm : ");
                        int quantity = sc.nextInt();
                        kho.put(sku, new Products(sku, name, price, quantity));
                        System.out.println("Thêm thành công");
                    }
                }
                case 2 -> {
                    System.out.println("Chức năng 2");
                    System.out.print("Nhập SKU muốn xuất : ");
                    String sku = sc.nextLine();
                    Products products = kho.get(sku);
                    System.out.println("Nhập số lượng muốn xuất : ");
                    int quantity = sc.nextInt();
                    if (quantity <= 0){
                        System.out.println("Số lượng phải > 0");
                    } else if (quantity > products.getQuantity()) {
                        System.out.println("Hàng trong kho không đủ");
                        System.out.println("Trong kho còn : "+ products.getQuantity());

                    } else {
                        products.setQuantity(products.getQuantity() - quantity);
                        System.out.println("Xuất kho thành công");
                        System.out.println(products);
                    }

                }
                case 3 -> {
                    System.out.println("Chức năng 3");
                    System.out.print("Nhập SKU : ");
                    String sku = sc.nextLine();
                    Products products = kho.get(sku);
                    if (products == null){
                        System.out.println("KHông tìm thấy sản phẩm");
                    }else {
                        System.out.println("Tìm thấy sản phẩm");
                        System.out.println(products);
                    }
                }
                case 4 -> {
                    System.out.println("Chức năng 4");

                    System.out.println("Sản phẩm sắp hết hàng");
                    for (Products product : kho.values()) {
                        if (product.getQuantity() < 5) {

                            System.out.println(product);

                        }
                    }
                }
                case 5 -> {
                    System.out.println("Chức năng 5");
                    double tongKho = 0;
                    for (Products product : kho.values()){
                        tongKho += product.getPrice() * product.getQuantity();
                    }
                    System.out.println("Tổng giá trị kho : "+ tongKho);
                }
                case 6 -> {
                    System.out.println("Chức năng 6");
                    for (Products products : kho.values()){
                        System.out.println(products);
                    }
                }
                case 0 -> {
                    System.out.println("Thoát");
                }
                default -> {
                    System.out.println("Nhập sai số");
                }
            }
            sc.nextLine();
        }while (chon != 0);
    }
}
