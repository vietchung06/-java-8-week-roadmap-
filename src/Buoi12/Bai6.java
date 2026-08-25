package Buoi12;
//6.	Cho 2 Set<String> học viên lớp Java và lớp SQL: in ra học cả 2 lớp (giao),
// học ít nhất 1 lớp (hợp), chỉ học Java (hiệu) — dùng retainAll, addAll, removeAll.
import java.util.HashSet;
import java.util.Set;

public class Bai6 {
    public static void main(String[] args) {
        Set<String> java = new HashSet<>();
        Set<String> sql = new HashSet<>();
        java.add("Chung");
        java.add("Nam");
        java.add("Anh");
        java.add("Dung");

        sql.add("Chung");
        sql.add("Nam");
        sql.add("Duong");
        sql.add("Tu");

        //Giao. học cả 2 lớp
        Set<String> giao = new HashSet<>(java);
        giao.retainAll(sql); // giữ lại phần tử giống nhau của 2 Set

        //Hợp. học ít nhất 1 lớp
        Set<String> hop = new HashSet<>(java);
        hop.addAll(sql);//Lấy tất cả phần tử của 2 tập, không lấy trùng.

        //chỉ học java
        Set<String> hieu = new HashSet<>(java);
        hieu.removeAll(sql);//Tìm những phần tử có trong tập thứ nhất nhưng không có trong tập thứ hai.

        System.out.println("JAVA : "+ java);
        System.out.println("SQL : "+ sql);
        System.out.println("Học cả 2 lớp : "+ giao);
        System.out.println("Học it nhất 1 lớp : "+ hop);
        System.out.println("Chỉ học java : "+ hieu);

    }
}
