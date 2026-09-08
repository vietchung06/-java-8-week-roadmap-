package Buoi15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//7.	Từ List<Student>: nhóm theo xếp loại bằng Collectors.groupingBy — so sánh với bài làm tay bằng Map buổi 12.
class Student{
    String name;
    double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
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
        students.add(new Student("Chung", 5));
        students.add(new Student("Nam", 9));
        students.add(new Student("Anh", 7));
        students.add(new Student("Dũng", 7.5));
        students.add(new Student("Long", 1));
        students.add(new Student("Bảo", 6));

        Map<String, List<Student>> map = students.stream()
                .collect(Collectors.groupingBy(Student::getRank));//Nhóm các Student có cùng rank lại với nhau.

        System.out.println(map);

    }
}
