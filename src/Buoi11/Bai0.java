package Buoi11;

import java.util.ArrayList;
import java.util.List;

public class Bai0 {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();

        //add. thêm phần tử
        lst.add(6);
        lst.add(9);
        System.out.println("List mới add : "+ lst);

        //add(index, element) thêm vào vị tr chỉ đinh
        lst.add(1,7);
        lst.add(2,8);
        System.out.println("List mới là : "+ lst);

        //get(int index) trả về giá trị list tại vị trí index
        System.out.println(lst.get(2));

        //size  trả về số phần tử của list
        System.out.println(lst.size());

        //remove(index) xóa giá trị tại vị trí chỉ định
        lst.remove(1);
        System.out.println("List sau khi xóa : "+ lst);

        //remove xóa phân tử được chỉ điịnh
        ArrayList<Integer> lst2 = new ArrayList<>(List.of(1,2,3,4,7));
        System.out.println("lst2 : "+lst2);
        lst2.remove(Integer.valueOf(7));
        System.out.println("lst2 sau khi xóa : "+lst2);

        //set(index element) thay đổi thong tin tại vị trí index
        ArrayList<Integer> lst3 = new ArrayList<>(List.of(1,2,3,4,7));
        System.out.println("lst3: "+ lst3);
        lst3.set(4,5);
        System.out.println("lst3 sau khi sửa : "+ lst3);

        //contains() kiểm tra phần tử có tồn tại trong list hay không
        ArrayList<Integer> lst4 = new ArrayList<>(List.of(13,27,38,46,87));
        boolean ktra = lst4.contains(4);
        System.out.println(ktra);

        //indexOf() tìm vị trị đầu tiên của phần tử trong list -> không tồn tại trả về -1
        ArrayList<Integer> lst5 = new ArrayList<>(List.of(13,27,38,46,87,46));
        System.out.println(lst5.indexOf(9));
        System.out.println("Tìm thấy tại vị trí index = "+ lst5.indexOf(46));


        //duyệt list
        //cách 1
        ArrayList<Integer> lst6 = new ArrayList<>(List.of(13,27,38,46,87,46));
        System.out.println("lst6 dùng duyệt for each");
        for (int vl : lst6){
            System.out.println(vl);
        }

        //cách 2 khi cần sử dụng đến index
        ArrayList<Integer> lst7 = new ArrayList<>(List.of(13,27,38,46,87,46));
        System.out.println("lst6 dùng duyệt for");
        for (int i = 0; i < lst7.size(); i++){
            int vl = lst7.get(i);
            System.out.println(vl);
        }
    }
}
