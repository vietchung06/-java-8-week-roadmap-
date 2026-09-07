package Buoi14;
//4.	Viết method parseAge(String input): chuyển chuỗi thành số bằng Integer.parseInt,
// bắt NumberFormatException, validate 0-150, sai thì ném InvalidAgeException.
class InvalidAgeException extends  RuntimeException{
public InvalidAgeException(String message){
    super(message);
}
}
public class Bai4 {
   public static int pareAge(String input){
       int age;
       try {
           age = Integer.parseInt(input);
       } catch (NumberFormatException e) {
           System.out.println("Tuổi pha là 1 số");
           return 0;
       }
       if (age < 0 || age > 150){
           throw new InvalidAgeException("Tuổi phải > 0 và < 150");
       }
       return age;
   }

    public static void main(String[] args) {
        int age = pareAge("-1");
        System.out.println("Tuổi " + age);
    }
}
