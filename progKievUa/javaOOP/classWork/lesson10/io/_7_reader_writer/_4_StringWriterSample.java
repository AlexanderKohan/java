package progKievUa.javaOOP.classWork.lesson10.io._7_reader_writer;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

/**
 * @author Bohdan Vanchuhov
 */
public class _4_StringWriterSample {
    public static void main(String[] args) {
        Writer stringWriter = new StringWriter();

        try (PrintWriter printWriter = new PrintWriter(stringWriter)) {
            printWriter.println("Hello");
            printWriter.println("123");
        }

        String text = stringWriter.toString();
        System.out.println(text);
    }
}
