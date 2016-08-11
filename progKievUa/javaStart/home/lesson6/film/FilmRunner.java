package progKievUa.javaOOP.home.lesson6.film;

import java.util.List;

/**
 * Created by Alexander on 8/10/2016.
 */

public class FilmRunner {
    public static void main(String[] args) {
        List<Film> filmList = FilmUtils.createFilms();

        FilmUtils.findFilmByGenre(filmList, Genre.HORROR);
        FilmUtils.findFilmByGenre(filmList, Genre.THRILLER);
        FilmUtils.findFilmByYear(filmList, Genre.COMEDY, 1990, 2000);
    }
}
