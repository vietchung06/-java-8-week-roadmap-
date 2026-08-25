package Buoi12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//5.	Quản lý danh bạ điện thoại: Map<String, String> (tên → SĐT),
// menu thêm/tìm/xóa/in toàn bộ; chặn thêm tên đã tồn tại (hỏi ghi đè không).
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();
        int chon;
        sc.nextLine();
        do {
            System.out.println("=====MENU=====");
            System.out.println("CN1 : Thêm");
            System.out.println("CN2 : Tìm");
            System.out.println("CN3 : Xóa");
            System.out.println("CN4 : In toàn bộ");
            System.out.println("0 : Thoát");
            System.out.println("Nhập chức năng muốn chọn : ");
            chon = sc.nextInt();
            switch (chon){
                case 1 -> {

                    System.out.println("Chức năng 1");
                    sc.nextLine();
                    System.out.print("Nhập tên muốn thêm : ");
                    String name = sc.nextLine();

                    if (map.containsKey(name)){
                        System.out.println("Tên đã tồn tại");
                        System.out.print("Bạn có muốn ghi đè không (y/n) : ");
                        String a = sc.nextLine();
                        if (a.equalsIgnoreCase("y")){
                            System.out.println("Nhập SDT cập nhật : ");
                            String sdt = sc.nextLine();
                            map.put(name, sdt);
                            System.out.println("Đã cập nhật sđt");
                        }else {
                            System.out.println("Không thay đổi");
                        }
                    }else {
                        System.out.println("Nhập SDT muốn thêm");
                        String sdtNew = sc.nextLine();
                        map.put(name, sdtNew);
                        System.out.println("Đã thêm liên hệ");
                    }
                }
                case 2 -> {
                    System.out.println("Chức năng 2");
                    sc.nextLine();
                    System.out.print("Nhập tên muốn tìm : ");
                    String searchName = sc.nextLine();
                    if (map.containsKey(searchName)){
                        String phone = map.get(searchName);
                        System.out.println("Tên : "+ searchName);
                        System.out.println("Số điện thoại : "+ phone);
                    }else {
                        System.out.println("Không tìm thấy");
                    }
                }
                case 3 -> {
                    System.out.println("Chức năng 3");
                    sc.nextLine();
                    System.out.print("Nhập tên cần xóa : ");
                    String delteName = sc.nextLine();
                    if (map.containsKey(delteName)){
                        map.remove(delteName);
                        System.out.println("Đã xóa ");
                    }else {
                        System.out.println("Không tìm thấy tên");
                    }
                }
                case 4 -> {
                    System.out.println("Chức năng 4");
                    System.out.println("===In toàn bộ===");
                    for (Map.Entry<String, String> entry : map.entrySet() ){
                        System.out.println("Tên : "+ entry.getKey());
                        System.out.println("SĐT : "+entry.getValue());

                    }
//                    for (String name : map.keySet()){
//                        System.out.println("Tên : "+ name);
//                        System.out.println("SĐT : "+ map.get(name));
//                    }
                }
                case 0 -> {

                    System.out.println("Thoát");
                }
                default -> {
                    System.out.println("Chọn không đúng chức năng");
                }
            }




        }while (chon != 0);
    }
}
