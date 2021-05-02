package Inheritance;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Book {


    private String author;
    private double price;
    private String title;
    private  String version;
    private String publisher;
    private String ISBN;
    private String publishDate;

    public Book(){
        System.out.println("This si the default Parent Constructor");
    }

    public Book(String author, double price) {
        this.author = author;
        this.price = price;
        this.title = title;
        this.version = version;
        this.publisher = publisher;
        this.ISBN = ISBN;
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }
     public void setPrice(double price) {
        this.price = price;
    }
    public double setPrice(double price,double taxRate)  {
        this.price = price+taxRate;
        return price;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public void readFile() throws FileNotFoundException{
        FileReader file = new FileReader("c:/sum.txt");
    }

    public Ebook getBook(){
        Ebook ebook1 = new Ebook();
        return ebook1;
    }
}
