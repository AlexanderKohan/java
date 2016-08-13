package java.progKievUa.javaOOP.home.lesson2.book;

import java.util.List;

/**
 * Created by Alexander on 7/19/2016.
 */
public class BookRunner {
    public static void main(String[] args) {

        List<Book> books = BookUtils.createBooks();

        List<Book> bookList1 = BookUtils.findByAuthor(books, "Dan Brown");
        System.out.println(bookList1);

        List<Book> bookList2 = BookUtils.findByPublisher(books, "Kindle");
        System.out.println(bookList2);

        List<Book> bookList3 = BookUtils.findByPublicationYear(books, 2014);
        System.out.println(bookList3);
    }

}
