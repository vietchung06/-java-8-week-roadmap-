package Buoi7;
class Order{
    private String status;
    public Order(String status){
        this.status = status;

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status.equals("NEW")
                || status.equals("PAID")
                || status.equals("SHIPPED")){
            if (this.getStatus().equals("SHIPPED")){
                System.out.println("Không thể chuyển về NEW");
                return;
            }
            System.out.println("Trạng thái hợp lệ");
            this.status = status;
        }else {
            System.out.println("Trang thái không hợp lệ");
        }


    }
}
public class Bai7 {
    public static void main(String[] args) {
        Order o = new Order("PAID");
        System.out.println("Trạng thái đơn hàng : "+ o.getStatus());
        o.setStatus("SHIPPED");
        System.out.println("Trạng thái đơn hàng : "+ o.getStatus());
        o.setStatus("NEWS");
        System.out.println("Trạng thái đơn hàng : "+ o.getStatus());
        o.setStatus("NEW");
        System.out.println("Trạng thái đơn hàng : "+ o.getStatus());

    }
}
