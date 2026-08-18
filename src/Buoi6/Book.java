package Buoi6;

public class Book {
    String title;
    String author;
    double price;

   public Book (String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public Book (String title){
       this(title, null, 0);

    }
}
