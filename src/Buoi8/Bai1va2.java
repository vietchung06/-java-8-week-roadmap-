package Buoi8;
//1.	Tạo Person (name, age) và 2 con Employee (thêm salary), Customer (thêm loyaltyPoint).
//2.	Method displayInfo() ở cha; con gọi super.displayInfo() rồi bổ sung phần riêng.
class Person{
    protected String name;
    protected  int age;
     public Person(String name, int age){
         this.name = name;
         this.age = age;

     }
     public void displayInfo(){
         System.out.println("Tên : "+ name);
         System.out.println("Tuổi : "+ age);
     }

}
class Employee extends Person{
    double salary;
    public Employee(String name, int age, double salary){
        super(name, age);
        this.salary = salary;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Lương : "+ salary);
    }


}
class Customer extends Person{
    int loyaltyPoint;
    public Customer(String name, int age, int loyaltyPoint) {
        super(name, age);
        this.loyaltyPoint = loyaltyPoint;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Điểm : "+ loyaltyPoint);
    }

}

public class Bai1va2 {
    public static void main(String args[]) {
        Employee e = new Employee("Chung", 10, 20);
        Customer c = new Customer("Nam", 15, 10);
        System.out.println("Thông tin nhân viên : ");
        e.displayInfo();
        System.out.println("Thông tin nhân viên : ");
        c.displayInfo();


    }
}
