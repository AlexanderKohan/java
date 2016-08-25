package progKievUa.javaOOP.classWork.lesson10.io._2_output_stream;

import progKievUa.javaOOP.classWork.lesson10.io.TestIOUtils;

import java.io.*;

/**
 * @author Bohdan Vanchuhov
 */
public class _2_FileOutputStream {
    public static final String FILE_NAME = "files/io/fos_sample.out";

    public static void main(String[] args) {
        try (OutputStream outputStream = new FileOutputStream(FILE_NAME)) {
            TestIOUtils.testOutputStream(outputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
