package progKievUa.javaOOP.classWork.lesson10.io._9_std_io;

import progKievUa.javaOOP.classWork.lesson10.io.TestIOUtils;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * @author Bohdan Vanchuhov
 */
public class RedirectionSample {
    public static void main(String[] args) {
        PrintStream console = System.out;

        // Change standard input
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayOutputStream));

        doTask();

        // Return console input
        System.setOut(console);

        TestIOUtils.waitInput();

        byte[] bytes = byteArrayOutputStream.toByteArray();
        String s = new String(bytes);
        System.out.print(s);
    }

    private static void doTask() {
        System.out.println("Hello");
        System.out.println("123");
    }
}
