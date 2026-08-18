package Buoi6;
 class Rectangle {
    double chieuDai;
    double chieuRong;

    public Rectangle(double chieuDai, double chieuRong){
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
class Circle {
    double banKinh;


    public Circle(double banKinh){
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
        Rectangle a = new Rectangle(10, 20);
        Circle b =new Circle(10);
        System.out.println("Diện tích HCN : "+ a.area());
        System.out.println("Chu vi HCN : "+ a.perimeter());
        System.out.println("Diện tích HT : "+ b.area());
        System.out.println("Chu vi HT : "+ b.perimeter());
    }
}
