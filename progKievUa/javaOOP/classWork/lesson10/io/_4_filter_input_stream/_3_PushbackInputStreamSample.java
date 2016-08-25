package progKievUa.javaOOP.classWork.lesson10.io._4_filter_input_stream;

import progKievUa.javaOOP.classWork.lesson10.io.TestIOUtils;

import java.io.*;

/**
 * @author Bohdan Vanchuhov
 */
public class _3_PushbackInputStreamSample {
    public static void main(String[] args) {
        byte[] bytes = {1, 2, 3, 4, 5};

        InputStream sourceInputStream = new ByteArrayInputStream(bytes);
        try (PushbackInputStream pushbackInputStream = new PushbackInputStream(sourceInputStream)) {
            doTask(pushbackInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void doTask(PushbackInputStream pushbackInputStream) throws IOException {
        System.out.println(pushbackInputStream.read());

        pushbackInputStream.unread(100);
        System.out.println(pushbackInputStream.read());

        TestIOUtils.testInputStream(pushbackInputStream);
    }
}
