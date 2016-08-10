package progKievUa.javaOOP.home.lesson6.film;

/**
 * Created by Alexander on 8/10/2016.
 */

public enum Genre {
    ACTION("action"),
    ADVENTURE("adventure"),
    COMEDY("comedy"),
    CRIME("crime"),
    DRAMA("drama"),
    HISTORICAL("historical"),
    HORROR("horror"),
    MUSICALS("musical"),
    WAR("war"),
    THRILLER("thriller"),
    WESTERN("western");

    private final String genre;

    Genre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "genre='" + genre + '\'' +
                '}';
    }
}
