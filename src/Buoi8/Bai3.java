package Buoi8;
//3.	Cây kế thừa 3 tầng: Vehicle → Car → ElectricCar, mỗi tầng thêm field/method riêng
class Vehicle{
    protected String name;
    protected int banh;
    public Vehicle(String name, int banh){
        this.name = name;
        this.banh = banh;

    }
    public void color(){
        System.out.println(name + " màu đỏ ");
    }
}
class Car extends Vehicle {
    String coi;
    public Car(String name, int banh, String coi){
        super(name, banh);
        this.coi = coi;
    }
    @Override
    public void color(){
        super.color();
        System.out.println("Còi : "+ coi );
    }
}
class ElectricCar extends Car{
    String nhienLieu;
    public ElectricCar(String name, int banh,String coi, String nhienLieu){
        super(name, banh,coi);
        this.nhienLieu = nhienLieu;

    }
    @Override
    public void color(){
        super.color();
        System.out.println("Nhiên liệu : "+ nhienLieu);
    }
}


public class Bai3 {
    public static void main(String[] args) {
        Car c = new Car("Honda",4, "BIP BIP");
        ElectricCar e = new ElectricCar("Vinfast", 4 ,"AA", "Điện");
        System.out.println("Xe ô tô");
        c.color();
        System.out.println("Xe điện");
        e.color();
    }
}
