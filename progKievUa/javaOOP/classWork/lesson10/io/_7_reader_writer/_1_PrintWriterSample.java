package progKievUa.javaOOP.classWork.lesson10.io._7_reader_writer;

import java.io.PrintWriter;

/**
 * @author Bohdan Vanchuhov
 */
public class _1_PrintWriterSample {
    public static void main(String[] args) {
        // BAD
        PrintWriter printWriter = new PrintWriter(System.out, true);
        printWriter.println("Hello");
    }
}
