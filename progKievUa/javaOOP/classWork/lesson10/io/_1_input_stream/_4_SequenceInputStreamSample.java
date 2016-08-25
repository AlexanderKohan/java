package progKievUa.javaOOP.classWork.lesson10.io._1_input_stream;

import progKievUa.javaOOP.classWork.lesson10.io.TestIOUtils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;

/**
 * @author Bohdan Vanchuhov
 */
public class _4_SequenceInputStreamSample {
    public static void main(String[] args) {
        byte[] buffer1 = {1, 2, 3, 4, 5};
        byte[] buffer2 = {10, 20, 30, 40, 50};

        InputStream inputStream1 = new ByteArrayInputStream(buffer1);
        InputStream inputStream2 = new ByteArrayInputStream(buffer2);

        InputStream inputStream = new SequenceInputStream(inputStream1, inputStream2);
        try {
            TestIOUtils.testInputStream(inputStream);
            TestIOUtils.testInputStream(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
