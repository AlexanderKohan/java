package progKievUa.javaOOP.classWork.lesson10.io._1_input_stream;

import progKievUa.javaOOP.classWork.lesson10.io.TestIOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringBufferInputStream;

/**
 * @author Bohdan Vanchuhov
 */
public class _2_StringBufferInputStreamSample {
    public static void main(String[] args) {
        String s = "Богдан";
        try (InputStream inputStream = new StringBufferInputStream(s)) {
            TestIOUtils.testInputStream(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
