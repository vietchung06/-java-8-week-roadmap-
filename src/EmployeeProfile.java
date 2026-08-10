public class EmployeeProfile {
    public static void main(String[] args) {
        String msv = "dh345";
        String ten="Chung";
        double luongcoban=12.500;
        int tuoi=20;
        int songaycong=50;
        boolean nhanvienchinhthuc=true;
        double luongtheongaycong=luongcoban/26*songaycong;
        double thue=10%luongtheongaycong;
        System.out.println("=================");
        System.out.println("Mã sinh viên:\t"+msv);
        System.out.println("Ten:\t"+ten);
        System.out.println("Tuổi:\t"+tuoi);
        System.out.println("-------------------");
        System.out.println("Lương cơ bản:\t"+luongcoban);
        System.out.println("Số ngày công:\t"+songaycong);
        System.out.println("Nhân viên chính thức:\t"+nhanvienchinhthuc);
        System.out.println("Lương theo ngày công:\t"+luongtheongaycong);
        System.out.println("Thuế:\t"+thue);


    }
}
