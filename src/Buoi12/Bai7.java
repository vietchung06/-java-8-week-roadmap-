package Buoi12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//7.	Thống kê điểm: từ List<Student>,
// xây Map<String, List<Student>> nhóm học sinh theo xếp loại (key: "Gioi", "Kha"...).
class Student{
    String name;
    double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getRank(){
        if (score >= 8){
            return "Giỏi";
        }else if (score >= 6.5){
            return "khá";
        } else if (score >= 5) {
            return "Trung Bình";

        }else {
            return "Yếu";
        }
    }

    @Override
    public String toString() {
        return "Tên : "+ name +" - "+ "Điểm : "+ score;
    }
}
public class Bai7 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("chung", 8));
        students.add(new Student("Nam", 8));
        students.add(new Student("Anh", 3));
        students.add(new Student("Dung", 3));

        Map<String, List<Student>> map = new HashMap<>();
        for (Student student : students){
            String rank = student.getRank();
            if(!map.containsKey(rank)){
                map.put(rank, new ArrayList<>());
            }
            map.get(rank).add(student);//lấy học nhóm rank rồi thêm học sinh mới vào
        }
        System.out.println(map);
    }
}
