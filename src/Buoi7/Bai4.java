package Buoi7;
class Person{
   private int age;
   private String email;

   public Person(int age, String email){
       this.age = age;
       this.email = email;
   }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
       if (age >= 0 && age <=150){
           this.age = age;
           System.out.println("Tuổi hợp lệ");
       }else {
           System.out.println("Tuổi không hợp lệ");
       }

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
       if (email.contains("@") ){
           System.out.println("Email hợp lệ");
           this.email = email;
       }else {
           System.out.println("Email không hợp lệ");
       }

    }
}
public class Bai4 {
    public static void main(String[] args) {
        Person p = new Person(15, "chung@gmail.com");
        p.setAge(160);
        System.out.println("Tuổi : " + p.getAge());
        p.setEmail("Nam@gamail.com");
        System.out.println("Email : " + p.getEmail());
    }
}
