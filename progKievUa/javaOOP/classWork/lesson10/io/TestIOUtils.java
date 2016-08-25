package progKievUa.javaOOP.classWork.lesson10.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Bohdan Vanchuhov
 */
public final class TestIOUtils {
    private TestIOUtils() {}

    public static void testInputStream(InputStream inputStream) throws IOException {
        System.out.println(inputStream.read());
        System.out.println(inputStream.read());

        byte[] buffer = new byte[10];
        inputStream.read(buffer);
        System.out.println(Arrays.toString(buffer));

        System.out.println(inputStream.read());
    }

    public static void testOutputStream(OutputStream outputStream) throws IOException {
        outputStream.write((byte)'1'); // 49
        outputStream.write((byte)'2'); // 50

        byte[] buffer = {65, 66, 67, 68, 69}; // A..E
        outputStream.write(buffer);
    }

    public static void waitInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input something: ");
        scanner.next();
    }
}
