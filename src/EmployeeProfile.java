public class EmployeeProfile {
    //in thng tin tính lương tổng=lương cơ bản / 26 * số ngay công; thue=luong tổng *10%
    //\t khoảng cách
    public static void main(String[] args) {
        String msv = "dh345";
        String ten = "Chung";
        double luongcoban = 12.500;
        int tuoi = 20;
        int soNgayCong = 50;
        boolean nhanVienChinhThuc = true;
        double luongTheoNgayCong = luongcoban/26 * soNgayCong;
        double thue=luongTheoNgayCong * 10/100;
        System.out.println("=================");
        System.out.println("Mã sinh viên:\t"+ msv);
        System.out.println("Ten:\t"+ ten);
        System.out.println("Tuổi:\t"+ tuoi);
        System.out.println("-------------------");
        System.out.println("Lương cơ bản:\t"+ luongcoban);
        System.out.println("Số ngày công:\t"+ soNgayCong);
        System.out.println("Nhân viên chính thức:\t"+ nhanVienChinhThuc);
        System.out.println("Lương theo ngày công:\t"+ luongTheoNgayCong);
        System.out.println("Thuế:\t"+ thue);


    }
}
