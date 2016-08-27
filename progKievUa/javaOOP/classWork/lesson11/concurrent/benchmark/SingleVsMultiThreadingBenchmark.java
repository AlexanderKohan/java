package progKievUa.javaOOP.classWork.lesson11.concurrent.benchmark;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static progKievUa.javaOOP.classWork.lesson11.benchmark.BenchmarkUtil.printMilliTime;

/**
 * @author Bohdan Vanchuhov
 */
public class SingleVsMultiThreadingBenchmark {
    public static final int ARRAY_SIZE = 80_000;
    public static final int CALCULATIONS_QUANTITY = 1_000;
    public static final int TREADS_QUANTITY = 8; //Runtime.getRuntime().availableProcessors();

    public static void main(String[] args) {
        printMilliTime("Multi Thread",
                () -> multiThreadFill(createArray(ARRAY_SIZE), TREADS_QUANTITY));
        printMilliTime("Multi Thread with step",
                () -> multiThreadFillWithStep(createArray(ARRAY_SIZE), TREADS_QUANTITY));
        printMilliTime("Single thread",
                () -> fill(createArray(ARRAY_SIZE)));
    }

    public static double[] createArray(int size) {
        return new double[size];
    }

    public static void fill(double[] array, int from, int to) {
        for (int i = from; i < to; i++) {
            array[i] = calculation();
        }
    }

    public static void fill(double[] array) {
        fill(array, 0, array.length);
    }

    public static void fillWithStep(double[] array, int from, int step) {
        for (int i = from; i < array.length; i += step) {
            array[i] = calculation();
        }
    }

    private static double calculation() {
        double x = 1;

        for (int i = 0; i < CALCULATIONS_QUANTITY; i++) {
            x = Math.sin(x);
        }

        return x;
    }

    public static void multiThreadFill(double[] array, int threadsQuantity) {
        ExecutorService executorService = Executors.newFixedThreadPool(threadsQuantity);

        int rangeLength = array.length / threadsQuantity;
        for (int threadId = 0; threadId < threadsQuantity; threadId++) {
            final int from = threadId * rangeLength;

            int last = threadId + rangeLength;
            final int to = last <= array.length ? last : array.length;

            Thread thread = new Thread(() -> {
                fill(array, from, to);
            });
            executorService.submit(thread);
        }
        executorService.shutdown();

        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void multiThreadFillWithStep(double[] array, int threadsQuantity) {
        ExecutorService executorService = Executors.newFixedThreadPool(threadsQuantity);

        for (int threadId = 0; threadId < threadsQuantity; threadId++) {
            final int from = threadId;
            final int step = threadsQuantity;

            Thread thread = new Thread(() -> {
                fillWithStep(array, from, step);
            });
            executorService.submit(thread);
        }
        executorService.shutdown();

        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
