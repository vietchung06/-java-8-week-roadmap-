package Buoi13;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//3.	Method generic <T> T getLast(List<T> list)
// trả phần tử cuối; xử lý list rỗng bằng cách trả Optional<T>.
public class Bai3 {
    public static <T> Optional<T> getLast(List<T> list){

        return Optional.of(list.get(list.size() - 1));
    }

    public static void main(String[] args) {
    List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        Optional<String> Ktra = getLast(list);
        System.out.println(Ktra);

    }
}
