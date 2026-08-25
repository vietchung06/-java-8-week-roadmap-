package Buoi12;

import java.util.HashMap;

public class Bai0 {
    public static void main(String[] args) {
        HashMap<Integer , String> map =new HashMap<>();

        //thêm dữ liệu vào
        map.put(1, "áo");
        map.put(2, "Quần ");
        map.put(3, "mũ");

        //lấy giá trị của 1 phâ tử
        String value = map.get(1);
        String value2 =map.get(2);
        String value3 = map.get(3);
        System.out.println(value);
        System.out.println(value2);
        System.out.println(value3);

        //xóa phần tử khỏi hashmap
        map.remove(1);
        System.out.println(map.get(1));

        //kiểm tra xem key có tông tại trong map k
        boolean check = map.containsKey(3);
        System.out.println(check);

        //kiểm tra xem 1 giá trị có tồn tại trong map k
        boolean checkvl = map.containsValue("áo");
        System.out.println(checkvl);

        //kiểm tra xem hashmap có rỗng k
        boolean bien = map.isEmpty();
        System.out.println(bien);

        //lấy số lợng phần tử,
        int soLuong = map.size();
        System.out.println(soLuong);

        //duệt hashmap
        for (Integer key : map.keySet()){
            String vl = map.get(key);
            System.out.println(key + " : " + vl);
        }

    }
}
