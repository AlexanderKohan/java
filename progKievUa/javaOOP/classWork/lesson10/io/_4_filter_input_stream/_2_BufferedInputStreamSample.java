package progKievUa.javaOOP.classWork.lesson10.io._4_filter_input_stream;

import progKievUa.javaOOP.classWork.lesson10.io.TestIOUtils;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Bohdan Vanchuhov
 */
public class _2_BufferedInputStreamSample {
    public static void main(String[] args) {
        byte[] bytes = {1, 2, 3, 4, 5};

        InputStream sourceInputStream = new ByteArrayInputStream(bytes);
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(sourceInputStream)) {
            TestIOUtils.testInputStream(bufferedInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
