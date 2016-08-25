package progKievUa.javaOOP.classWork.lesson10.io._7_reader_writer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Bohdan Vanchuhov
 */
public class _3_BufferedReaderSample {
    public static final String FILE_NAME = "files/io/br_sample.in";

    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_NAME))) {
            doTask(bufferedReader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void doTask(BufferedReader bufferedReader) throws IOException {
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
