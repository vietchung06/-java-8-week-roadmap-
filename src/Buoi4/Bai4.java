package Buoi4;

import java.util.Scanner;
//4.	FizzBuzz 1-50: chia hết 3 in "Fizz", chia hết 5 in "Buzz",
// cả hai in "FizzBuzz".

public class Bai4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }else {
                System.out.println(+i);
            }

        }
    }
}
