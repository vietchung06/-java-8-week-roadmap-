package Buoi13;
//4.	Class generic MyStack<T> với push(), pop(), peek(), isEmpty()
// cài bằng ArrayList — vừa học generics vừa hiểu cấu trúc Stack.

import java.util.ArrayList;

//Stack hoạt động theo nguyên tắc:LIFO — Last In, First Out -> Vào sau → ra trước.
class MyStack<T>{
    ArrayList<T> data = new ArrayList<>();
    public void push(T value){

        data.add(value);
    }
    public T pop(){

        return data.remove(data.size()-1);
    }
    public T peek(){

        return data.get(data.size()-1);
    }
    public boolean isEmpty(){

        return data.isEmpty();
    }

    @Override
    public String toString() {

        return data.toString();
    }
}
public class Bai4 {
    public static void main(String[] args) {
        MyStack<Integer> m1 = new MyStack<>();
        m1.push(20);
        m1.push(30);
        m1.push(25);
        System.out.println(m1);
        System.out.println("Xem phần tử ở đầu: "+m1.peek());
        System.out.println("Lấy phâ tử đầu và xóa: "+ m1.pop());
        System.out.println("Sau khi dùng pop: "+ m1);
        System.out.println("Stack có rỗng không: "+ m1.isEmpty());
    }
}
