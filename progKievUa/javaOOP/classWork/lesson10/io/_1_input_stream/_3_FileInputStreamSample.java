package progKievUa.javaOOP.classWork.lesson10.io._1_input_stream;

import progKievUa.javaOOP.classWork.lesson10.io.TestIOUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Bohdan Vanchuhov
 */
public class _3_FileInputStreamSample {
    public static final String FILE_NAME = "files/io/fis_sample.in";

    public static void main(String[] args) {
        try (InputStream inputStream = new FileInputStream(FILE_NAME)) {
            TestIOUtils.waitInput();

            TestIOUtils.testInputStream(inputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
