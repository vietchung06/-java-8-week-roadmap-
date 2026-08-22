package Buoi10;
//4.	Chuyển Shape buổi 9 thành abstract class với abstract area() và method thường describe()
// — giải thích comment vì sao abstract hợp lý hơn.
abstract class Shape {
    public abstract double area();
    public void describe(){
        System.out.println("Hình");
    }
}
class Triangle extends Shape{
    double day;
    double chieuCao;

    public Triangle(double day, double chieuCao) {
        this.day = day;
        this.chieuCao = chieuCao;
    }

    @Override
    public double area() {
        return 0.5 * day * chieuCao;
    }

    @Override
    public void describe() {
        System.out.println("Hình tam giác");
    }
}
class Rectangle extends Shape{
    double chieuDai;
    double chieuRong;

    public Rectangle(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public double area() {
        return chieuDai * chieuRong;
    }

    @Override
    public void describe() {
        System.out.println("Hình chữ nhật");
    }
}
class Circle extends Shape{
    double banKinh;

    public Circle(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public void describe() {
        System.out.println("Hình tròn");
    }

    @Override
    public double area() {
        return   Math.PI * Math.pow(banKinh, 2);
    }

}
public class Bai4 {
    public static void main(String[] args) {
        Shape[] s = {
                new Triangle(3.5,10),
                new Rectangle(12,11),
                new Circle(2.8)
        };
        for (int i = 0; i < s.length; i++){
            s[i].describe();
            System.out.println("Diện tích : "+ s[i].area());
        }
    }
}
// Mỗi hình như Triangle, Rectangle, Circle có công thức area() khác nhau,
// nên để area() là abstract để bắt buộc các lớp con phải override.