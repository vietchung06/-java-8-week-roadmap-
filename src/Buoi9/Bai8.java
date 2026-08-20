package Buoi9;
//8.	Viết comment trả lời: overriding và overloading
// — cái nào quyết định lúc biên dịch, cái nào lúc chạy? Cho ví dụ minh họa từng cái.

//Overloading (nạp chồng) → được quyết định lúc biên dịch (compile time).
// Java dựa vào tên phương thức + số lượng/kiểu tham số để xác định gọi hàm nào.
//Overriding (ghi đè) → được quyết định lúc chạy (runtime).
// Khi có quan hệ kế thừa, Java dựa vào đối tượng thực tế
// đang được tạo để xác định phương thức nào được gọi.
 class Person{
     public  void age(int tuoi){
         System.out.println("Tuổi : "+ tuoi);
     }
     public void age(double tuoi){
         System.out.println("Tuổi"+ tuoi);
     }
 }
 class Account extends Person {
     @Override
     public void age(int tuoi) {
         System.out.println("Tuổi người dùng"+ tuoi);
     }
 }
public class Bai8 {
    public static void main(String[] args) {
        Person person = new Person();
        Person p =new Account();
        p.age(10); // gọi age(int)
        p.age(21.5); // gọi age(double)
        p.age(20);
//// OVERLOADING:
//// Có nhiều phương thức cùng tên nhưng khác kiểu tham số.
//// Khi biên dịch, Java nhìn vào kiểu tham số để quyết định gọi phương thức nào.
//// => Overloading quyết định lúc biên dịch.
//
//
//// OVERRIDING:
//// Biến p có kiểu Person, nhưng đối tượng thực tế là Account.
//// Khi chạy chương trình, Java thấy đối tượng thực tế là Account nên
//// gọi phương thức đã được ghi đè trong Account.
//// => Overriding quyết định lúc chạy.
    }

}
