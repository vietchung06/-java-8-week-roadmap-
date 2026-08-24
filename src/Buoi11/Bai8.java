package Buoi11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bai8 {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>(List.of(1,8,5,6,2,3));
        System.out.println("Trước khi sắp xếp : "+ number);
        Collections.sort(number);
        System.out.println("Sau khi sắp xếp : "+number);

    }
}
