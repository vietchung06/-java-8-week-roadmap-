package Buoi7;
class Book{
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;

    }
    public Book (String title){
        this(title, null, 0);

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
class Employee{
    private String name;
    private double salary;
    private int workingdays;

    public Employee(String name, double salary, int workingdays){
        this.name = name;
        this.salary = salary;
        this.workingdays = workingdays;

    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getWorkingdays() {
        return workingdays;
    }

    public void setWorkingdays(int workingdays) {
        this.workingdays = workingdays;
    }

    double calculateMonthlyPay(){
        return salary * workingdays;
    }
    double thue(){
        return salary * workingdays  * 10/100;
    }
}

public class Bai6 {
    public static void main(String[] args) {
        Book b = new Book("abc", "Chung", 20);
        Employee e = new Employee("Nam", 10, 20);
        System.out.println("Thông tin sách");
        System.out.println("Title : "+ b.getTitle());
        b.setAuthor("Anh");
        System.out.println("Tác giả : "+ b.getAuthor());
        System.out.println("Price : "+ b.getPrice());

        System.out.println("Thông tin nhân viên: ");
        System.out.println("Name : "+ e.getName());
        System.out.println("Salary : "+ e.getSalary());
        e.setWorkingdays(30);
        System.out.println("Ngày làm : "+ e.getWorkingdays());
        System.out.println("Tổng lương : "+ e.calculateMonthlyPay());
        System.out.println("Thuế : "+ e.thue());
    }
}
