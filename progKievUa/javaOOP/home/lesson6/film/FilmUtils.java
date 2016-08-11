package progKievUa.javaOOP.home.lesson6.film;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexander on 8/10/2016.
 */

public class FilmUtils {
    public static List<Film> createFilms() {
        List<Film> filmList = new ArrayList<>();
        filmList.add(new Film("The Departed", 2006, Genre.THRILLER));
        filmList.add(new Film("Home Alone", 1990, Genre.COMEDY));
        filmList.add(new Film("Se7en", 1995, Genre.THRILLER));
        filmList.add(new Film("Psycho", 1960, Genre.HORROR));
        filmList.add(new Film("Sleepy Hollow", 1995, Genre.HORROR));
        return filmList;
    }

    public static List<Film> findFilmByGenre(List<Film> filmList, Genre genre) {
        for (Film film : filmList) {
            if (film.getGenre().equals(genre)) {
                System.out.println("Genre: " + genre.getGenre() + ", Film: " + film.getTitle());
            }
        }
        return filmList;
    }

    public static List<Film> findFilmByYear(List<Film> filmList, Genre genre, int startYear, int endYear) {
        for (Film film : filmList) {
            if ((film.getYear() >= startYear) && (film.getYear() <= endYear) && film.getGenre().equals(genre)) {
                System.out.println("Genre: " + genre.getGenre() + ", Years: " + startYear + "-" + endYear
                        + ", Film: " + film.getTitle());
            }
        }
        return filmList;
    }
}
