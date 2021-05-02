package Inheritance;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Ebook extends Book{
    private String downloadSize;
    private String format;
    private String title;
    private double price;
 public Ebook(){
     System.out.println("This is a default child constructor");
 }
    public Ebook(String downloadSize, String format, String title) {
        super();
        this.downloadSize = downloadSize;
        this.format = format;
        this.title = title;
    }

    public String getDownloadSize() {
        return downloadSize;
    }

    public void setDownloadSize(String downloadSize) {
        this.downloadSize = downloadSize;
    }

    public String getFormat() {

        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public double setPrice(double price,double taxRate) {
        this.price = price+taxRate+15;
        return price;
    }
    public double getPrice(){
     return price;
    }
    public Ebook getBook(){
        Ebook book= new Ebook(  );
        return book;
    }



}
