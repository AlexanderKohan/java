package progKievUa.javaOOP.home.lesson10.FilmIO;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import progKievUa.javaOOP.classWork.lesson10.minServlet.Validator;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexander on 8/28/2016.
 */

public class FilmIOUtils {
    private static final String CSV_DELIMITER = ", ";

    public FilmIOUtils() {
    }

    //Char Output
    public static void outputFilmIntoFile(Film film, String fileName) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            outputFilm(film, writer);
        }
    }

    public static void outputFilmIntoFile(List<Film> films, String filename) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            outputFilms(films, writer);
        }
    }

    public static void outputFilm(Film film, PrintWriter writer) {
        writer.println(convertFilmToCsv(film));
    }

    public static void outputFilms(List<Film> films, PrintWriter writer) {
        for (Film film : films) {
            outputFilm(film, writer);
        }
    }

    // Char Input

    public static Film readFilmFromFile(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            return readFilm(reader);
        }
    }

    private static Film readFilm(BufferedReader reader) throws IOException {
        String line = reader.readLine();
        return parseFilmFromCsv(line);
    }

    public static List<Film> readFilmsFromFile(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            return readFilms(reader);
        }
    }

    public static List<Film> readFilms(BufferedReader reader) throws IOException {
        List<Film> persons = new ArrayList<>();

        String line;
        while ((line = reader.readLine()) != null) {
            Film film = parseFilmFromCsv(line);
            if (film != null) {
                persons.add(film);
            }
        }

        return persons;
    }

    //Transformation Film <-> csv

    public static String convertFilmToCsv(Film film) {
        return film.getTitle() + CSV_DELIMITER + film.getYear() + CSV_DELIMITER + film.getGenre();
    }

    public static Film parseFilmFromCsv(String s) {
        if (s == null || s.isEmpty()) {
            return null;
        }
        String[] tokens = s.split(CSV_DELIMITER);

        if (!Validator.isInt(tokens[1])) {
            return null;
        }

        String title = tokens[0];
        int year = Integer.parseInt(tokens[1]);
        String genre = tokens[3];

        return new Film(title, year, genre);
    }

    //BINARY OUTPUT
    public static void outputBinaryFilmIntoFile(List<Film> films, String fileName) throws IOException {
        try (ObjectOutput objectStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)))) {
            objectStream.writeObject(films);
        }
    }

    //BINARY INPUT
    public static List<Film> readBinaryPersonsFromFile(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInput objectInput = new ObjectInputStream(new FileInputStream(fileName))) {
            return (List<Film>) objectInput.readObject();
        }
    }
}
