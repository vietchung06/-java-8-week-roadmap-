package Buoi8;
//6.	Override toString() cho tất cả class đã viết tuần này,
// in object trực tiếp bằng System.out.println(obj).
class Product {
    String name;
    double price;
    int quantity;

    Product (String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    @Override
    public String toString(){
        return name + " " +"Giá : " + price + " " + "Số lượng : " +quantity;
    }


}
class Employee2 {
    String name;
    double salary;
    int workingdays;

    public Employee2(String name, double salary, int workingdays) {
        this.name = name;
        this.salary = salary;
        this.workingdays = workingdays;
    }
    @Override
    public String toString(){
        return name + " " + salary + " " + workingdays;
    }


}
public class Bai6 {
    public static void main(String[] args) {
        Product p =new Product("Áo", 12,10);
        Employee2 e =new Employee2("A", 1000, 20);



        System.out.println(p);
        System.out.println(e);
    }
}
