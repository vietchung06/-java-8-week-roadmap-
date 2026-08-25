package Buoi12;

import java.util.HashMap;
import java.util.Map;

//4.	Kiểm tra 2 chuỗi có phải anagram (cùng tập ký tự, VD "listen"/"silent") bằng Map đếm ký tự.
public class Bai4 {
    public static void main(String[] args) {
        String s1 = "gunhcu";
        String s2 = "chungu";
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (char c : s1.toCharArray()){//.toCharArray()  tách chuỗi thành từng ký tự
            int soLan = map1.getOrDefault(c,0);
            soLan += 1;
            map1.put(c, soLan);
        }
        for (char c : s2.toCharArray()){
            int soLan = map2.getOrDefault(c,0);
            soLan += 1;
            map2.put(c, soLan);
        }
        if (map1.equals(map2)){//Map.equals() = cùng Key + cùng Value, không cần cùng thứ tự.
            System.out.println("Đây là anagram");
        }else {
            System.out.println("Không phải anagram");
        }

    }
}
