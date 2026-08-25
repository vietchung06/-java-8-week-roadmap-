package Buoi12;

import java.util.HashMap;
import java.util.Map;
//1.	Đếm số lần xuất hiện của mỗi từ trong một câu bằng Map<String, Integer> (dùng getOrDefault
public class Bai1 {
    public static void main(String[] args) {
        String cau = "chung viet chung viet ";
        Map<String, Integer> map = new HashMap<>();
        String[] words = cau.split(" ");//tách chuỗi thành từng từ
        for (String word : words){
            int soLan = map.getOrDefault(word,0);
            soLan +=1;
            map.put(word, soLan);
        }
        System.out.println(map);




    }
}
