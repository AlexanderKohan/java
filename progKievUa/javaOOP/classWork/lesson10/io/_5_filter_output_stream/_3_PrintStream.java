package progKievUa.javaOOP.classWork.lesson10.io._5_filter_output_stream;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

/**
 * @author Bohdan Vanchuhov
 */
public class _3_PrintStream {
    public static void main(String[] args) {
        ByteArrayOutputStream byteOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteOutputStream);

        printStream.println("Hello");
        printStream.print("Hello\r\n");

        byte[] bytes = byteOutputStream.toByteArray();
        System.out.println(Arrays.toString(bytes));
        System.out.println(bytes.length);

        System.out.println(printStream.checkError());
    }
}
