package progKievUa.javaOOP.home.lesson6.film;

import java.util.List;

/**
 * Created by Alexander on 8/10/2016.
 */

public class FilmRunner {
    public static void main(String[] args) {
        List<Film> filmList = FilmUtils.createFilms();

        FilmUtils.findByGenre(filmList, Genre.HORROR);
        FilmUtils.findByGenre(filmList, Genre.THRILLER);
        FilmUtils.findByYear(filmList, Genre.COMEDY, 1990, 2000);
    }
}
