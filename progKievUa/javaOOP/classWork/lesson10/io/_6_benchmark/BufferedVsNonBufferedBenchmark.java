package progKievUa.javaOOP.classWork.lesson10.io._6_benchmark;

import java.io.*;

/**
 * @author Bohdan Vanchuhov
 */
public class BufferedVsNonBufferedBenchmark {
    public static final String FILE_NAME = "files/io/benchmark_sample.txt";
    public static final int OUTPUTS_QUANTITY = 1_000_000;

    public static void main(String[] args) {
        System.out.println(timeOfBufferedOutput());
        System.out.println(timeOfNonBufferedOutput());
    }

    private static void bufferedOutput() {
        try (OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(FILE_NAME))) {
            doTask(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void nonBufferedOutput() {
        try (OutputStream outputStream = new FileOutputStream(FILE_NAME)) {
            doTask(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void doTask(OutputStream outputStream) throws IOException {
        for (int i = 0; i < OUTPUTS_QUANTITY; i++) {
            outputStream.write((byte)'A');
            outputStream.write((byte)'\n');
        }
    }

    private static long timeOfBufferedOutput() {
        long start = System.currentTimeMillis();

        bufferedOutput();

        long finish = System.currentTimeMillis();
        return finish - start;
    }

    private static long timeOfNonBufferedOutput() {
        long start = System.currentTimeMillis();

        nonBufferedOutput();

        long finish = System.currentTimeMillis();
        return finish - start;
    }
}
