package Buoi6;
class Employee {
    String name;
    double salary;
    int workingdays;

    public Employee(String name, double salary, int workingdays){
        this.name = name;
        this.salary = salary;
        this.workingdays = workingdays;
    }
    double calculateMonthlyPay(){
        return salary * workingdays;
    }
    double thue(){
        return salary * workingdays  * 10/100;
    }
}
public class Bai5 {
    public static void main(String[] args) {
        Employee pr = new Employee("Chung", 10000, 20);
        System.out.println("Thông tin người làm");
        System.out.println("Tên : "+ pr.name);
        System.out.println("Lương : "+ pr.salary);
        System.out.println("Ngày làm : "+ pr.workingdays);
        System.out.println("Lương theo tháng : "+ pr.calculateMonthlyPay());
        System.out.println("Thuế : "+ pr.thue());
    }
}
