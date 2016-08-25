package progKievUa.javaOOP.classWork.lesson10.io._7_reader_writer;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * @author Bohdan Vanchuhov
 */
public class _2_OutputIntoFile {
    public static final String FILE_NAME = "files/io/pw_sample.out";

    public static void main(String[] args) {
        try (PrintWriter printWriter = new PrintWriter(FILE_NAME)) {
            doTask(printWriter);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void doTask(PrintWriter writer) {
        writer.println("Hello");
    }
}
