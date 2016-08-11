package progKievUa.javaOOP.home.lesson2.book;

import progKievUa.javaOOP.home.lesson2.immutable.Line;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexander on 7/20/2016.
 */
public class BookUtils {
    static List<Book> createBooks() {
        List<Book> books = new ArrayList<>();

        books.add(new Book(
                "The Hunger Games",
                "Hardcover",
                11,
                374,
                2008,
                "Scholastic Press",
                "Suzanne Collins"
        ));

        books.add(new Book(
                "Inferno",
                "Hardcover",
                13,
                578,
                2014,
                "Kindle",
                "Dan Brown"
        ));

        books.add(new Book(
                "Cometh the Hour",
                "Paperback",
                12,
                389,
                2015,
                "Kindle",
                "Jeffrey Archer"
        ));

        return books;
    }

    public static List<Book> findByAuthor(List<Book> books, String author) {

        List<Book> list = new ArrayList<>();

        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                list.add(book);
            }
        }
        return list;
    }

    public static List<Book> findByPublicationYear(List<Book> books, int publicationYear){

        List<Book> list = new ArrayList<>();

        for (Book book : books){
            if ( book.getYearOfPublisher() > (publicationYear)){
                list.add(book);
            }
        }
        return list;
    }

    public static List<Book> findByPublisher(List<Book> books, String publisher){

        List<Book> list = new ArrayList<>();

        for (Book book : books){
            if ( book.getPublisher().equals(publisher)){
                list.add(book);
            }
        }
        return list;
    }
}