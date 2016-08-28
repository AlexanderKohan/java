package progKievUa.javaOOP.home.lesson10.FilmIO;

import java.io.IOException;
import java.util.List;

/**
 * Created by Alexander on 8/28/2016.
 */
public class FilmRunner {

    public static void main(String[] args) throws IOException {
        List<Film> filmList = FilmUtils.createFilms();
    }
}
