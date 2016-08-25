package progKievUa.javaOOP.classWork.lesson10.io._6_benchmark;

import java.io.*;
import java.util.Scanner;

/**
 * @author Bohdan Vanchuhov
 */
public class BufferedReaderVsScannerBenchmark {
    public static final String FILE_NAME = "files/io/benchmark_sample.txt";

    public static void main(String[] args) {
        System.out.printf("BufferedReader:\t%22d\n", timeOfBufferedReading());
        System.out.printf("Scanner + BufferedReader:\t%10d\n", timeOfBufferedScannerReading());
        System.out.printf("Scanner:\t%26d\n", timeOfScannerReading());
    }

    private static void bufferedReading() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_NAME))) {
            doBufferedReading(bufferedReader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void doBufferedReading(BufferedReader bufferedReader) throws IOException {
        String line;
        while ((line = bufferedReader.readLine()) != null) {}
    }

    private static void bufferedScannerReading() {
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(FILE_NAME)))) {
            doScanning(scanner);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void scannerReading() {
        try (Scanner scanner = new Scanner(new File(FILE_NAME))) {
            doScanning(scanner);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void doScanning(Scanner scanner) {
        while (scanner.hasNext()) {
            scanner.nextLine();
        }
    }

    private static long timeOfBufferedReading() {
        long start = System.currentTimeMillis();

        bufferedReading();

        long finish = System.currentTimeMillis();
        return finish - start;
    }

    private static long timeOfBufferedScannerReading() {
        long start = System.currentTimeMillis();

        bufferedScannerReading();

        long finish = System.currentTimeMillis();
        return finish - start;
    }

    private static long timeOfScannerReading() {
        long start = System.currentTimeMillis();

        scannerReading();

        long finish = System.currentTimeMillis();
        return finish - start;
    }
}
