package Buoi10;

import java.util.Scanner;

interface Payable {
    void pay();
}
abstract class Employee {
    private String name;
    private String id;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
     abstract double calculateSalary();
    public void displayInfo(){
        System.out.println("Tên : "+ getName());
        System.out.println("ID : "+ getId() );
    }

}
class Manager extends Employee implements Payable{
    double luongCung;
    double bonus;

    public Manager(String name, String id, double luongCung, double bonus) {
        super(name, id);
        this.luongCung = luongCung;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return luongCung + bonus;
    }

    @Override
    public void pay() {
        System.out.println("Trả lương manager");
    }

    @Override
    public void displayInfo() {
        System.out.println("MANAGER");
        System.out.println("Tên : "+ getName());
        System.out.println("ID : "+ getId() );
        System.out.println("Lương cứng : "+ luongCung);
        System.out.println("Bonus : "+ bonus);
    }
}

class Staff extends Employee implements Payable{
    int workDay;
    double luongNgay;

    public Staff(String name, String id, int workDay, double luongNgay) {
        super(name, id);
        this.workDay = workDay;
        this.luongNgay = luongNgay;
    }

    @Override
    double calculateSalary() {
        return workDay * luongNgay;
    }

    @Override
    public void pay() {
        System.out.println("Trả lương staff");
    }

    @Override
    public void displayInfo() {
        System.out.println("STAFF");
        System.out.println("Tên : "+ getName());
        System.out.println("ID : "+ getId() );
        System.out.println("Ngày làm : "+ workDay);
        System.out.println("Luơng 1 ngày : "+ luongNgay);
    }
}
class Intern extends Employee {
    double troCap;

    public Intern(String name, String id, double troCap) {
        super(name, id);
        this.troCap = troCap;
    }

    @Override
    double calculateSalary() {
        return troCap;
    }

    @Override
    public void displayInfo() {
        System.out.println("INTERN");
        System.out.println("Tên : "+ getName());
        System.out.println("ID : "+ getId() );
        System.out.println("Trợ cấp : "+ troCap);

    }
}
public class HeThongQuanLyNhanSu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng nhân viên : ");
        int n = sc.nextInt();
        sc.nextLine();
        Employee[] e = new Employee[n];
        for (int i = 0; i < e.length; i++){
            System.out.print("Nhập tên nhân viên "+ (i+1) + " : ");
            String name = sc.nextLine();
            System.out.print("Nhập ID nhân viên "+ (i+1) + " : ");
            String id = sc.nextLine();
            System.out.println("=============");
            System.out.println("1 : MANAGER");
            System.out.println("2 : STAFF");
            System.out.println("3 : INTERN");
            System.out.print("Chọn loại nhân viên : ");
            int chon = sc.nextInt();
            switch (chon){
                case 1 -> {
                    System.out.println("Nhập lương cứng : ");
                    double luongCung = sc.nextDouble();
                    System.out.println("Nhập bonus : ");
                    double bonus = sc.nextDouble();
                    e[i] = new Manager(name, id, luongCung,bonus);
                }
                case 2 -> {
                    System.out.println("Nhập ngày làm : ");
                    int workDay = sc.nextInt();
                    System.out.println("Nhập lương 1 ngày : ");
                    double luongNgay = sc.nextDouble();
                    e[i] = new Staff(name, id, workDay, luongNgay);
                }
                case 3 -> {
                    System.out.println("Nhâp trợ cấp : ");
                    double troCap = sc.nextDouble();
                    e[i] = new Intern(name , id, troCap);
                }
                default -> {
                    System.out.println("Số không hợp lệ");
                }
            }
            sc.nextLine();
        }
        System.out.println("===========");
        int c = 0;
        do {
            System.out.println("======MENU=====");
            System.out.println("CN1 : In bảng lương");
            System.out.println("CN2 : Tổng quỹ lương");
            System.out.println("CN3 : Tìm theo tên");
            System.out.println("CN4 : Sắp xếp theo lương");
            System.out.println("CN5 : Trả lương hàng loạt");
            System.out.println("CN6 : Thoát");
            System.out.println("Chon chức năng : ");
             c = sc.nextInt();
            switch (c){
                case 1 -> {
                    System.out.println("Chức năng 1");
                    for (int i = 0 ;i < e.length; i++){
                       e[i].displayInfo();
                        System.out.println("Lương : "+ e[i].calculateSalary());
                    }
                }
                case 2 -> {
                    System.out.println("Chức năng 2");
                    double tongLuong = 0;
                    double luong;
                    for (int i = 0 ;i < e.length; i++){
                        luong = e[i].calculateSalary();
                        tongLuong += luong;
                    }
                    System.out.println("Tổng quỹ lương : "+ tongLuong);
                }
                case 3 -> {
                    sc.nextLine();
                    System.out.println("Chức năng 3");
                    System.out.print("Nhập tên cần tìm : ");
                    String search = sc.nextLine();

                    boolean tim = false;
                    for (int i = 0; i < e.length; i++){
                        if (search.equalsIgnoreCase(e[i].getName())){
                            System.out.println("Đã tìm thấy nhân viên");
                            System.out.println("Tên nhân viên:"+ e[i].getName());
                            System.out.println("ID : "+ e[i].getId());
                            tim = true;
                        }

                    }
                    if (!tim){
                        System.out.println("Không tìm thấy nhân viên");
                    }
                }
                case 4 -> {
                    System.out.println("Chức năng 4");

                    for (int i = 0; i < e.length - 1; i++) {

                        for (int j = 0; j < e.length - 1 - i; j++) {

                            if (e[j].calculateSalary()
                                    > e[j + 1].calculateSalary()) {

                                Employee temp = e[j];
                                e[j] = e[j + 1];
                                e[j + 1] = temp;
                            }
                        }
                    }

                    System.out.println("Đã sắp xếp theo lương tăng dần!");

                    for (int i = 0; i < e.length; i++) {
                        System.out.println(
                                "Tên: " + e[i].getName()
                                        + " | ID: " + e[i].getId()
                                        + " | Lương: " + e[i].calculateSalary()
                        );
                    }

                }
                case 5 -> {
                    System.out.println("Chức năng 5");
                    for (int i = 0; i < e.length; i++) {

                        if (e[i] instanceof Payable) {

                            Payable p = (Payable) e[i];

                            p.pay();
                        }
                    }
                }
                case 6 -> {
                    System.out.println("Thoát");
                }
            }
        }while (c != 6);


    }
}
