package progKievUa.javaOOP.classWork.lesson10.io._1_input_stream;



import progKievUa.javaOOP.classWork.lesson10.io.TestIOUtils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Bohdan Vanchuhov
 */
public class _1_ByteArrayInputStreamSample {
    public static void main(String[] args) {
        byte[] buffer = {1, 2, 3, 4, 5};

        // try-with-resource, Java 7
        try (InputStream inputStream = new ByteArrayInputStream(buffer)) {
            TestIOUtils.testInputStream(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
