package progKievUa.javaOOP.classWork.lesson10.io._5_filter_output_stream;

import java.io.PrintStream;

/**
 * @author Bohdan Vanchuhov
 */
public class _2_SystemOut {
    public static void main(String[] args) {
        PrintStream printStream = System.out;

        printStream.println(10);
        printStream.println(20L);
        printStream.println("Hello");
    }
}
