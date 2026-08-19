package Buoi8;
//7.	Thử truy cập field private của cha từ con → quan sát lỗi; đổi sang protected → chạy được;
class Persons {
    protected String name;
    protected int age;
    Persons(String name, int age){
        this.name = name;
        this.age = age;
    }
}
class Customer2 extends Persons{
    String address;
    public Customer2(String name, int age,String address){
        super(name, age);
        this.address = address;
    }
    public void show(){
        System.out.println("Tên : "+ name);
        System.out.println("Tuổi : "+ age);
    }
}

public class Bai7 {
    public static void main(String[] args) {
        Customer2 c =new Customer2("Chung", 12, "HN");
        c.show();
    }
}
