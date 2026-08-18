package Buoi6;
class Counter{
    static int count = 0;
   int sum ;
    public Counter(int sum){
        count++;
        this.sum = sum;
    }


}
public class Bai6 {
    public static void main(String[] args) {
        Counter obj1 = new Counter(12);
//        Counter obj2 = new Counter();
//        Counter obj3 = new Counter();
//        Counter obj4 = new Counter();
//        Counter obj5 = new Counter();
        System.out.println("Số object đã tạo là : "+ Counter.count);
        System.out.println(obj1.sum);
    }
}
