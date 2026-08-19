package Buoi8;
//4.	Refactor Rectangle, Circle buổi 6 để kế thừa chung cha Shape có field name.
class Shape{
    protected String name;
    public Shape(String name){
        this.name = name;
    }
}
class Rectangle extends Shape {
    double chieuDai;
    double chieuRong;

    public Rectangle(String name, double chieuDai, double chieuRong){
        super(name);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;

    }
    double area(){
        return chieuDai * chieuRong;
    }
    double perimeter(){
        return (chieuDai + chieuRong) * 2;
    }
}
class Circle extends Shape{
    double banKinh;


    public Circle(String name, double banKinh){
        super(name);
        this.banKinh = banKinh;


    }
    double area(){
        return Math.PI * banKinh*banKinh;
    }
    double perimeter(){
        return 2* Math.PI * banKinh;
    }
}

public class Bai4 {
    public static void main(String[] args) {
        Rectangle a = new Rectangle("Hình chữ nhật",10, 20);
        Circle b =new Circle("Hình tròn",10);
        System.out.println("Hình : "+ a.name);
        System.out.println("Diện tích  : "+ a.area());
        System.out.println("Chu vi : "+ a.perimeter());
        System.out.println("Hình : "+ b.name);
        System.out.println("Diện tích : "+ b.area());
        System.out.println("Chu vi : "+ b.perimeter());
    }

}
