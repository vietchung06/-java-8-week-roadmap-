package Buoi9;
//5.	Animal với makeSound();
// các con Dog, Cat, Duck kêu khác nhau; duyệt Animal[] cho cả "trang trại" kêu.
class Animal {
    public void makeSound(){
        System.out.println("Động vật kêu");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Gâu Gâu");
    }
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meo Meo");
    }
}
class Duck extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Quạc Quạc");
    }
}
public class Bai5 {
    public static void main(String[] args) {
        Animal[] animal = {
                new Dog(),
                new Cat(),
                new Duck()
        };
        for (int i = 0; i < animal.length; i++){
            animal[i].makeSound();
        }

    }
}
