package Buoi9;
//S =0.5 * đáy * chiều cao
//1.	Lớp cha Shape với area(); các con Rectangle, Triangle, Circle override công thức riêng.
//2.	Mảng Shape[] chứa lẫn 3 loại hình, vòng lặp in diện tích
//3.	Từ mảng trên tìm hình có diện tích lớn nhất (thuật toán max buổi 5),
// và tính tổng diện tích tất cả các hình tròn (dùng instanceof).
class Shape {
    public double area(){
        return 0;
    }
}
class Rectangle extends Shape {
    double chieuDai;
    double chieuRong;
    public Rectangle(double chieuDai, double chieuRong){
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public double area() {
        return chieuDai * chieuRong;

    }
}
class Triangle extends Shape {
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
}
class Circle extends Shape {
    double banKinh;

    public Circle(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(banKinh, 2);
    }
}
public class Bai1va2va3 {
    public static void main(String[] args) {
//        Shape s = new Rectangle(10,20);
//        Shape s2 = new Triangle(12.5,12);
//        Shape s3 = new Circle(30);
//        System.out.println("Diện tích hình chữ nhật: " + s.area());
//        System.out.println("Diện tích hình tam giác: " + s2.area());
//        System.out.println("Diện tích hình tròn: " + s3.area());
        Shape[] shapes = {
                new Rectangle(10, 20),
                new Triangle(12.5, 12),
                new Circle(30),
                new Circle(20)
        };

        for (int i = 0; i < shapes.length; i++) {
            Shape shape = shapes[i];
            System.out.println(shape.area());
        }
       Shape maxShape = shapes[0];
        for (int i =0; i < shapes.length; i++){
            if (shapes[i].area() > maxShape.area()){
                maxShape = shapes[i];
            }
        }
        System.out.println("Hình có diện tích lớn nhất là : "+ maxShape.area() );
        double tongDienTich = 0;

        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Circle) {//thể hiện của class
                tongDienTich += shapes[i].area();
            }
        }

        System.out.println("Tổng diện tích các hình tròn: "
                + tongDienTich);

    }

}
