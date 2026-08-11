package Buoi2;

import java.util.Scanner;

public class MayTinhSieuThi {
    //thêm sc.nextLine(); để tránh lỗi
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sp1");
        String ten = sc.nextLine();
        System.out.println("Nhập đơn giá sp1");
        double donGia = sc.nextDouble();
        System.out.println("Nhập số lượng sp1");
        int soLuong = sc.nextInt();
        sc.nextLine();

        System.out.println("Nhập tên sp2");
        String ten2 = sc.nextLine();
        System.out.println("Nhập đơn giá sp2");
        double donGia2 = sc.nextDouble();
        System.out.println("Nhập số lượng sp2");
        int soLuong2 = sc.nextInt();
        sc.nextLine();

        System.out.println("Nhập tên sp3");
        String ten3 = sc.nextLine();
        System.out.println("Nhập đơn giá sp3");
        double donGia3 = sc.nextDouble();
        System.out.println("Nhập số lượng sp3");
        int soLuong3 = sc.nextInt();

        double tongTienHang = donGia * soLuong + donGia2 * soLuong2 + donGia3 * soLuong3;
        double VAT = tongTienHang * 8 / 100;
        double phiTui = tongTienHang < 100000 ? 1000 :0;
        double tongThanhToan = tongTienHang + VAT +phiTui;
        System.out.println("Tên SP1:"+ ten);
        System.out.println("Số lượng SP1:"+ soLuong);
        System.out.println("Đơn gia SP1:"+ String.format("%.0f", donGia) + "đ");
        System.out.println("========================");
        System.out.println("Tên SP2:"+ ten2);
        System.out.println("Số lượng SP2:"+ soLuong2);
        System.out.println("Đơn gia SP2:"+ String.format("%.0f", donGia2) + "đ");
        System.out.println("========================");
        System.out.println("Tên SP3:"+ ten3);
        System.out.println("Số lượng SP3:"+ soLuong3);
        System.out.println("Đơn gia SP3:"+ String.format("%.0f", donGia3) + "đ");
        System.out.println("========================");
        System.out.println("Tổng tiền hàng="+ String.format("%.0f", tongTienHang) + "đ");
        System.out.println("VAT="+ VAT);
        System.out.println("Phí túi="+ phiTui);
        System.out.println("Tổng thanh toán="+ String.format("%.0f", tongThanhToan) + "đ");

    }
}
