package Buoi13;

import java.util.ArrayList;
import java.util.List;

//2.	Method generic printList(List<T> list)
// in mọi phần tử; thử với List<String>, List<Integer>, List<Products>.
class Products{
    private String name;
    private double price;

    public Products(String name, double price) {
        this.name = name;
        this.price = price;
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
        return "Tên: "+ getName() + " | "+ "Giá: "+getPrice();
    }
}
public class Bai2 {
    public static  <T> void printList(List<T> list){//Khai báo method này sẽ sử dụng kiểu T
        for (T item : list){
            System.out.println(item);
        }
    }
//Viết một method nhưng có thể làm việc với nhiều kiểu dữ liệu khác nhau mà vẫn đảm bảo an toàn kiểu dữ liệu.
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("a");
        l.add("b");
        l.add("c");
        printList(l);

        List<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);
        printList(number);

        List<Products> products = new ArrayList<>();
        products.add(new Products("Áo", 2000));
        products.add(new Products("Quần", 3000));
        products.add(new Products("Mũ", 4000));
        printList(products);
    }
}
