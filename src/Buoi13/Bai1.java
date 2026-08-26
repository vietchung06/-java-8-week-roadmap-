package Buoi13;
//1.	Viết class generic Pair<K, V> với getKey(), getValue(),
// toString(); dùng thử với Pair<String, Integer> (tên-tuổi) và Pair<Integer, Product>.
class Pair<K, V>{
    K key;
    V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return getKey() + " - "+ getValue();
    }
}
class Product1 {
    private int id;
    private String name;
    private double price;

    public Product1(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "ID: "+ getId() + " | "+ "Tên: "+ getName()+ " | "+ "Giá: "+ getPrice();
    }
}
public class Bai1 {
    public static void main(String[] args) {
        Pair<String, Integer> p = new Pair<>("Chung", 20);
        System.out.println(p.getKey());
        System.out.println(p.getValue());
        System.out.println(p);

        Product1 product = new Product1(1, "áo",200);
        Pair<Integer, Product1> p2 = new Pair<>(1, product);
        System.out.println(p2.getKey());
        System.out.println(p2.getValue());
        System.out.println(p2);

    }

}
