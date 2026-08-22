package Buoi9;

import java.util.Scanner;

abstract class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }
    public double calculateSalary(){
        return 0;
    }
}
class FullTimeEmployee extends Employee {
    double luongCung;

    public FullTimeEmployee(String name, double luongCung) {
        super(name);
        this.luongCung = luongCung;
    }

    @Override
    public double calculateSalary() {
        return luongCung;
    }
}
class PartTimeEmployee extends Employee{
    double time;
    double dongia;

    public PartTimeEmployee(String name, double time, double dongia) {
        super(name);
        this.time = time;
        this.dongia = dongia;
    }

    @Override
    public double calculateSalary() {
        return time * dongia;
    }
}
class FreelancerEmployee extends Employee{
    int tasks;
    double priceTask;

    public FreelancerEmployee(String name, int tasks, double priceTask) {
        super(name);
        this.tasks = tasks;
        this.priceTask = priceTask;
    }

    @Override
    public double calculateSalary() {
        return tasks * priceTask;
    }
}
public class HeThongTinhLuongDaHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Employee e = new Employee("chung");      Employee là một abstract class nên không được
//        System.out.println("Tên chủ : "+e.name);   phép tạo object trực tiếp bằng new Employee(...).
        System.out.print("Nhập số nhân viên : ");
        int n = sc.nextInt();
        sc.nextLine();
        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++){
            System.out.println("Nhân viên thứ : "+ (i+1));
            System.out.print("Tên : ");
            String name = sc.nextLine();

            System.out.println("1 : Full time");
            System.out.println("2 : Part time");
            System.out.println("3 : Free lance");
            System.out.println("Chọn loại : ");
            int chon = sc.nextInt();

            switch (chon){
                case 1 -> {
                    System.out.print("Lương cứng : ");
                    double luongCung = sc.nextDouble();
                    employees[i] = new FullTimeEmployee(name, luongCung);
                }
                case 2 -> {
                    System.out.println("Số giờ công : ");
                    double time = sc.nextDouble();
                    System.out.println("Đơn giá : ");
                    double donGia = sc.nextDouble();
                    employees[i] = new PartTimeEmployee(name,time,donGia);
                }
                case 3 -> {
                    System.out.println("Số lượng task : ");
                    int soTasks = sc.nextInt();
                    System.out.println("Giá tiền của 1 task : ");
                    double priceTask = sc.nextDouble();
                    employees[i] = new FreelancerEmployee(name,soTasks,priceTask);
                }
                default -> {
                    System.out.println("Loại nhân viên không hợp lệ");
                }
            }
            sc.nextLine();
        }
        System.out.println("===============");
        double tongLuong = 0;
        Employee luongCaoNhat = employees[0];
        for (int i = 0; i < employees.length; i++){
            double salary = employees[i].calculateSalary();
            System.out.println("Tên : "+ employees[i].name + " Lương :"+ salary);
            tongLuong += salary;
            if (salary > luongCaoNhat.calculateSalary()){
                luongCaoNhat = employees[i];
            }

        }
        System.out.println("Tổng quỹ lương : "+ tongLuong);
        System.out.println("Người lương cao nhất : "+luongCaoNhat.name + " lương : "+ luongCaoNhat.calculateSalary() );
    }
}
