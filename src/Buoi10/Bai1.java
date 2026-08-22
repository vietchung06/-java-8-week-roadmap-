package Buoi10;
//1.	Interface Vehicle với start(), stop(); Car, Motorbike implement.
interface Vehicle{
     void start();
     void stop();
}
class Car implements Vehicle{

    @Override
    public void start() {
        System.out.println(" ô tô chạy");
    }

    @Override
    public void stop() {
        System.out.println("Ô tô dừng");
    }
}
class Motorbike implements Vehicle{

    @Override
    public void start() {
        System.out.println("Xe máy đang đi");
    }

    @Override
    public void stop() {
        System.out.println("Xe máy dừng lại");
    }
}

public class Bai1 {
    public static void main(String[] args) {
        Vehicle[] v ={
                new Car(),
                new Motorbike()
        };
        for (Vehicle vehicle : v){
            vehicle.start();
            vehicle.stop();
        }
    }
}
