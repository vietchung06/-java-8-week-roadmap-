package Buoi15;

import java.util.*;

class Products{
    String sku;
    String name;
    double price;
    int quantity;

    public Products(String sku, String name, double price, int quantity) {
        this.sku = sku;
        this.name = name;
        this.price = price;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getInventoryValue() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return "Sku: "+ getSku()+ "-"+ "Name: "+ getName()
                + "-" +"Giá: "+ getPrice()+ "-" + "Số lượng: "+getQuantity()+ "|";
    }
}
class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(String message){
        super(message);
    }
}
class InvalidQuantityException extends RuntimeException{
    public InvalidQuantityException(String message){
        super(message);
    }
}
class ProductRepository{
    Map<String, Products> kho = new HashMap<>();
    public void save(Products products){
        kho.put(products.getSku(), products);
    }
    public Products findbySku(String sku){
        Products products = kho.get(sku);
        if (products == null){
            throw new ProductNotFoundException("Không tìm thấy sản phẩm"+ sku);
        }
        return products;
    }
    public List<Products> findAll(){
        return new ArrayList<>(kho.values());
    }
}
class InventoryReport{
   private final ProductRepository repository;

    public InventoryReport(ProductRepository repository) {
        this.repository = repository;
    }
    public double tongGiaTriKho(){
        return repository.findAll().stream()
                .mapToDouble(p -> p.getPrice() * p.getQuantity())
                .sum();
    }
    public List<Products> top5Product(){
        return repository.findAll().stream()
                .sorted(Comparator.comparing(Products::getInventoryValue).reversed())
                .limit(5)
                .toList();
    }
    public List<Products> sapHetHang(){
        return repository.findAll().stream()
                .filter(p -> p.getQuantity() < 5)
                .toList();
    }
    public double giaTb(){
        return repository.findAll().stream()
                .mapToDouble(Products::getPrice)
                .average().orElse(0);

    }

}
public class BaoCaoKhoHangStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductRepository repository = new ProductRepository();
        repository.save(new Products("a1","áo",200,12));
        repository.save(new Products("a2","quần",100,34));
        repository.save(new Products("a3","Mũ",234,3));
        repository.save(new Products("a4","Kính",300,5));
        repository.save(new Products("a5","Cam",545,1));
        InventoryReport report = new InventoryReport(repository);
        int chon = 0;
        do {
            System.out.println("======MENU======");
            System.out.println("CN1: Tổng giá trị kho");
            System.out.println("CN2: Top5 sp giá trị cao nhất");
            System.out.println("CN3: Danh sách sắp hết hàng");
            System.out.println("CN4: Giá trung bình");
            System.out.println("CN5: Tìm theo từ khóa");
            System.out.println("CN6: Thoát");
            try {
                System.out.println("Chọn chức năng:");
                chon = sc.nextInt();
                switch (chon){
                    case 1 -> {
                        System.out.println("Chức năng 1");
                        System.out.println("Tổng giá trị kho");
                        System.out.println(report.tongGiaTriKho());
                    }
                    case 2 -> {
                        System.out.println("Chức năng 2");
                        System.out.println("Top5 sản phẩm giá trị cao nhất");
                        System.out.println(report.top5Product());
                    }
                    case 3 -> {
                        System.out.println("Chức năng 3");
                        System.out.println("Danh sách sắp hết hàng");
                        System.out.println(report.sapHetHang());
                    }
                    case 4 -> {
                        System.out.println("Chức năng 4");
                        System.out.println("Giá trung bình");
                        System.out.println(report.giaTb());
                    }
                    case 5 -> {
                        System.out.println("Chức năng 5");
                    }
                    case 6 -> {
                        System.out.println("Thoát");
                    }
                    default -> {
                        System.out.println("Số không hợp lệ");
                    }
                }
            }
            catch (ProductNotFoundException e) {
                System.out.println("Lỗi sản phẩm: " + e.getMessage());
            } catch (  InvalidQuantityException e){
                System.out.println("Lỗi số lượng: " + e.getMessage());
                sc.nextLine();
            }
            finally {
                System.out.println(
                        "=== Kết thúc thao tác ==="
                );
            }
        }while (chon != 6);
    }
}
