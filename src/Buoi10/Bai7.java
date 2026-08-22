package Buoi10;
//7.	Tạo interface Comparable-tự-chế MyComparable với method compareTo(T other)
// (dùng thử generics đơn giản trước tuần 3), cho Product implement để so sánh theo giá.

//Comparable cho phép một class tự định nghĩa “thứ tự” của các object thuộc class đó.
//Nếu giá sản phẩm A < giá sản phẩm B -> A đứng trước B

interface Comparable<T> {
    int compareTo(T other);
}
class Products implements Comparable<Products> {

    String name;
    double price;

    public Products(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Products other) {
        return Double.compare(this.price, other.price);
    }//So sánh price của sản phẩm hiện tại (this) với price của sản phẩm được truyền vào (other).
}

public class Bai7 {

    public static void main(String[] args) {

        Products p1 = new Products("Laptop", 1000);
        Products p2 = new Products("Điện thoại", 1500);

        int result = p1.compareTo(p2);

        if (result > 0) {
            System.out.println(p1.name + " đắt hơn " + p2.name);
        } else if (result < 0) {
            System.out.println(p1.name + " rẻ hơn " + p2.name);
        } else {
            System.out.println("Hai sản phẩm có cùng giá");
        }
    }
}