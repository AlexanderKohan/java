package progKievUa.javaOOP.classWork.lesson10.io._3_input_output_stream;

import progKievUa.javaOOP.classWork.lesson10.io.TestIOUtils;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @author Bohdan Vanchuhov
 */
public class _1_PipedInputOutputStream {
    public static void main(String[] args) throws IOException {
        PipedInputStream pipedInputStream = new PipedInputStream(); // in

        PipedOutputStream pipedOutputStream = new PipedOutputStream(pipedInputStream); // out
        TestIOUtils.testOutputStream(pipedOutputStream);

        TestIOUtils.testInputStream(pipedInputStream);

        // Program is not finished!!!
    }
}
