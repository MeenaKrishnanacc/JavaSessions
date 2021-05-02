package Inheritance;

import java.io.FileNotFoundException;

public class InheritanceTest {
    public static void main(String[] args) {

        Ebook ebook = new Ebook();
        Book ebook1 = new Ebook();

        Book book = new Book();

        ebook.setDownloadSize("45");
        ebook1.setTitle("JavaCourse");
        System.out.println(ebook1.getTitle());


       // Child has got access to all parent menbers but Parent doesnt have access to all child members(vriables+methods)
        // during compilation - Parent reference type is verified , during run time - child object is into action
        book.setTitle("Java Parent");
        System.out.println(book.getTitle());

        System.out.println(book.getPrice());
        book.setPrice(45.5,4.5);
        System.out.println(book.getPrice());
        book.setPrice(31l);
        System.out.println(book.getPrice());
        book.setPrice(31.5f);
        System.out.println(book.getPrice());

       // byte --> short --> int --> long --->float --->double
      // book.division();
       Book ebook3= new Ebook();
       //ebook3.setPrice(34,45);
        System.out.println("Price :"+ ebook3.getPrice());

    }
}
