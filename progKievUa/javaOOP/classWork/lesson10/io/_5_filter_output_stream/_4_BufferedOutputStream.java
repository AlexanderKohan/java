package progKievUa.javaOOP.classWork.lesson10.io._5_filter_output_stream;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

/**
 * @author Bohdan Vanchuhov
 */
public class _4_BufferedOutputStream {
    public static void main(String[] args) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        try (OutputStream outputStream = new BufferedOutputStream(byteArrayOutputStream)) {
            doTask(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        byte[] bytes = byteArrayOutputStream.toByteArray();
        System.out.println(Arrays.toString(bytes));
        System.out.println(bytes.length);
    }

    private static void doTask(OutputStream outputStream) throws IOException {
        outputStream.write(65);
    }
}
