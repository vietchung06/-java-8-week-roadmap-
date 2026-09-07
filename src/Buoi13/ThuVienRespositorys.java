package Buoi13;

import java.util.*;

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Tên: "+ getName()+ " - " + "Giá: "+getPrice();
    }
}
class Student {
    String name;
    double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Tên: "+ getName() + " - " + "Điêm: "+ getScore();
    }
}
class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException(String message) {
        super(message);
    }
}
interface CrudRepository<T> {
    int save(T item);
    Optional<T> findById(int id);
    List<T> findAll();
    boolean deleteById(int id);
    int count();
}
class InMemoryRepositorys<T> implements CrudRepository<T> {
    private Map<Integer, T> data = new HashMap<>();
    private int nextId = 1;
    @Override
    public int save(T item) {
        int id = nextId;
        nextId++;
        data.put(id, item);

        return id;
    }

    @Override
    public Optional<T> findById(int id) {

        T item = Optional.ofNullable(data.get(id))
                .orElseThrow(() ->
                        new ProductNotFoundException(
                                "Không tìm thấy dữ liệu có id: " + id
                        )
                );

        return Optional.of(item);
    }
    @Override
    public List<T> findAll() {

        return new ArrayList<>(data.values());
    }

    @Override
    public boolean deleteById(int id) {

        return data.remove(id) != null;
    }

    @Override
    public int count() {
        return data.size();
    }
}
public class ThuVienRespositorys {
    public static void main(String[] args) {
        InMemoryRepositorys<Product> p = new InMemoryRepositorys<>();
        int idp1 = p.save(new Product("áo",200));
        int idp2 = p.save(new Product("Quần", 300));
        int idp3 = p.save(new Product("Mũ", 500));
        System.out.println("Id product1: "+idp1);
        System.out.println("Id product2: "+idp2);
        System.out.println("Id Student1: "+idp3);

        System.out.println("Danh sách sản phẩm");
        // Tìm id tồn tại
        try {
            Optional<Product> product = p.findById(2);
            System.out.println("Tìm id 2: " + product);
        } catch (ProductNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // Tìm id không tồn tại
        try {
            Optional<Product> product = p.findById(4);
            System.out.println("Tìm id 4: " + product);
        } catch (ProductNotFoundException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
        System.out.println("Số product: "+p.count());
        System.out.println("Xóa Product id 2: " + p.deleteById(2));
        System.out.println("Sau khi xóa: " + p.findAll());

        System.out.println("==================================");

        InMemoryRepositorys<Student> s = new InMemoryRepositorys<>();
        int ids1 = s.save(new Student("Chung",5));
        int ids2 = s.save(new Student("Nam", 8));
        int ids3 = s.save(new Student("Anh",1));
        int ids4 = s.save(new Student("Quan", 3));
        System.out.println("Id Student1: "+ids1);
        System.out.println("Id Student2: "+ids2);
        System.out.println("Id Student1: "+ids3);
        System.out.println("Id Student2: "+ids4);
        System.out.println("Danh sách sản phẩm");
        System.out.println(p.findAll());
        try {
            Optional<Student> student = s.findById(1);
            System.out.println("Tìm id 1: " + student);
        } catch (ProductNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Số product: "+s.count());
        System.out.println("Xóa Product id 2: " + s.deleteById(2));
        System.out.println("Sau khi xóa: " + s.findAll());
    }
}
