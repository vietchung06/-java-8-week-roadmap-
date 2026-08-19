package Buoi8;
//8.	Tạo Employee (cha) và các con Developer (thêm programmingLanguage),
// Tester (thêm testType), ProjectManager (thêm teamSize) — mỗi con override displayInfo().
class Employee3{
      protected String name;
      protected int age;

      public Employee3(String name, int age){
          this.name = name;
          this.age = age;
      }
    public void displayInfo(){
        System.out.println("Tên : "+ name);
        System.out.println("Tuổi : "+ age);
    }

}
class Developer extends Employee3{
    String programmingLanguage;
    public Developer(String name, int age, String programmingLanguage){
        super(name, age);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Language : "+ programmingLanguage);
    }

}
class Tester extends Employee3{
    String testType;
    public Tester(String name, int age, String testType){
        super(name, age);
        this.testType = testType;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("TestType : "+ testType);
    }
}
class ProjectManager extends Employee3{
    int teamSize;
    public ProjectManager(String name, int age, int teamSize){
        super(name, age);
        this.teamSize = teamSize;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("TeamSize : "+ teamSize);
    }
}
public class Bai8 {
    public static void main(String[] args) {
        Developer d = new Developer("Chung",20, "java");
        Tester t = new Tester("A", 23, "ABC");
        ProjectManager  p =new ProjectManager("B", 24, 10);
        d.displayInfo();
        t.displayInfo();
        p.displayInfo();
    }
}
