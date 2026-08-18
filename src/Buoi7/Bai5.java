package Buoi7;
//F=C× 9/5 +32
class Temperature{
    private double celsius;
    public Temperature(double celsius){
        this.celsius = celsius;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
    public double getFahrenheit(){
        return celsius * 9 / 5 +32;
    }
}

public class Bai5 {
    public static void main(String[] args) {
        Temperature t = new Temperature(30);
        System.out.println("Độ C = "+ t.getCelsius());
        System.out.println("Độ F = "+ t.getFahrenheit());
    }
}
