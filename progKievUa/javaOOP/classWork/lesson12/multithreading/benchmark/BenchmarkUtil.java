package progKievUa.javaOOP.classWork.lesson12.multithreading.benchmark;

import progKievUa.javaOOP.classWork.lesson11.benchmark.Maker;

/**
 * @author Bohdan Vanchuhov
 */
public final class BenchmarkUtil {
    private BenchmarkUtil() {}

    public static long milliTime(Maker maker) {
        long start = System.currentTimeMillis();

        maker.make();

        long finish = System.currentTimeMillis();
        return finish - start;
    }

    public static long nanoTime(Maker maker) {
        long start = System.nanoTime();

        maker.make();

        long finish = System.nanoTime();
        return finish - start;
    }

    public static void printMilliTime(String message, Maker maker) {
        System.out.printf("%-25s:\t%d\n", message, milliTime(maker));
    }

    public static void printNanoTime(String message, Maker maker) {
        System.out.printf("%-25s:\t%d\n", message, nanoTime(maker));
    }
}
