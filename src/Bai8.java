public class Bai8 {
    public static void main(String[] args) {
        int soGiay = 3800;
        int gio=soGiay / 3600;
        int phut=soGiay / 60;
        int giay=soGiay % 60;
        System.out.println("Số giây:"+ soGiay);
        System.out.println("Số giờ:"+ gio);
        System.out.println("Số phút:"+ phut);
        System.out.println(" giây:"+ giay);

    }
}
