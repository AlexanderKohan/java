package progKievUa.javaOOP.classWork.lesson10.io._2_output_stream;

import progKievUa.javaOOP.classWork.lesson10.io.TestIOUtils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author Bohdan Vanchuhov
 */
public class _1_ByteArrayOutputStream {
    public static void main(String[] args) {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
            doTask(byteArrayOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void doTask(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        TestIOUtils.testOutputStream(byteArrayOutputStream);

        byte[] bytes = byteArrayOutputStream.toByteArray();
        System.out.println(Arrays.toString(bytes));
    }
}
