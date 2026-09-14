package lab;

import java.util.List;
import java.util.Scanner;

class Employee {
    private int id;
    private String full_name;
    private String email;
    private double salary;
    private String department;

    public Employee(int id, String full_name, String email, double salary, String department) {
        this.id = id;
        this.full_name = full_name;
        this.email = email;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "ID "+ id
                + "| Name " + full_name
                + "| Email " + email
                + "| Salary "+ salary
                + "| Department "+ department;
    }
}

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeRepository<Employee> employeeRepository = new EmployeeRepository<>();
        employeeRepository.save(new Employee(1,"Nguyen Van An", "an@gmail.com", 150000, "IT"));
        employeeRepository.save(new Employee(2,"Nguyễn Việt Chung", "chung@gmail.com", 200000, "IT"));
        employeeRepository.save(new Employee(3,"Nguyen Van Nam", "nan@gmail.com", 120000, "HR"));
        employeeRepository.save(new Employee(4,"Hồ Văn Quang", "quang@gmail.com", 180000, "HR"));
        employeeRepository.save(new Employee(5,"Nam Hải Anh", "anh@gmail.com", 250000, "Finance"));
        int chon = 0;
        do{
            System.out.println("======MENU======");
            System.out.println("CN1: Thêm");
            System.out.println("CN2: Tìm theo tên");
            System.out.println("CN3: Lọc lương");
            System.out.println("0 thoát");
            System.out.print("Nhập chức năng muốn chọn: ");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon){
                case 1 -> {
                    System.out.println("Chức năng 1");
                    System.out.println("Nhập id: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhập fullName: ");
                    String name = sc.nextLine();
                    System.out.println("Nhập email: ");
                    String email = sc.nextLine();
                    System.out.println("Nhập tiền lương: ");
                    double salary = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Nhập phòng ban: ");
                    String department = sc.nextLine();
                    Employee employee = new Employee(id, name, email, salary, department);
                    employeeRepository.save(employee);
                    System.out.println("Thêm thành công");

                }
                case 2 -> {
                    System.out.println("Chức năng 2");
                    System.out.println("Nhập tên muốn tìm: ");
                    String name =sc.nextLine();
                    try {
                        boolean tim = false;
                        for (Employee e : employeeRepository.findAll()){
                            if (e.getFull_name().equalsIgnoreCase(name)){
                                System.out.println("Tìm thấy nhân viên");
                                System.out.println(e);
                                tim = true;
                            }
                        }
                        if (tim == false){
                            throw new EmployeeNotFoundException("Không tìm thấy nhân viên");
                        }
                    } catch (EmployeeNotFoundException e) {

                        System.out.println(e.getMessage());
                    }

                }
                case 3 -> {
                    System.out.println("Chức năng 3");
                    System.out.print("Nhập mức lương: ");
                    double salary = sc.nextDouble();

                    List<Employee> result = employeeRepository.findAll()
                            .stream()
                            .filter(e -> e.getSalary() > salary)
                            .toList();
                            result.forEach(System.out::println);


                }
                case 0 -> {
                    System.out.println("Thoát");
                }
                default -> {
                    System.out.println("Nhập không đúng");
                }
            }

        }while (chon != 0);
    }
}
