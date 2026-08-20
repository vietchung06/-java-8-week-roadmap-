package Buoi9;
//4.	Class Printer với 3 method print()  không tham số, nhận String, nhận int.
class Printer {
    public void print(){
        System.out.println("In");
    }
    public void print(String name){
        System.out.println("Tên : "+ name);
    }
    public void print(int so){
        System.out.println("Số : "+ so);
    }
}
public class Bai4 {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print();
        p.print("Chung");
        p.print(10);
    }
}
