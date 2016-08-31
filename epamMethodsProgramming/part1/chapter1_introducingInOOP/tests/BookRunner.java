package epamMethodsProgramming.part1.chapter1_introducingInOOP.tests;

/**
 * Created by Alexander on 8/30/2016.
 */
public class BookRunner {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setBook("Java7");

        Book book2 = new Book();
        book2.setBook("Java7");

        if (book1.equals(book2)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
     }
}
