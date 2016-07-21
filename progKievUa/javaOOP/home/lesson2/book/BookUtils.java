package progKievUa.javaOOP.home.lesson2.book;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexander on 7/20/2016.
 */
public class BookUtils {

    private static List<Book> createBooks() {
        List<Book> books = new ArrayList<>();

        books.add(new Book(
                "The Hunger Games",
                "Hardcover",
                11,
                374,
                2008,
                "Suzanne Collins",
                "Scholastic Press"
        ));






        return books;
    }
}
