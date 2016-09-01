package progKievUa.javaOOP.classWork.lesson12.multithreading.multithreading.benchmark;

import java.util.concurrent.atomic.AtomicInteger;

import static progKievUa.javaOOP.classWork.lesson11.benchmark.BenchmarkUtil.printMilliTime;

/**
 * @author Bohdan Vanchuhov
 */
public class SynchronizationBenchmark {
    private static final int COUNTS_QUANTITY = 10_000_000;

    public static int x = 0;
    public static volatile int volatileX = 0;
    public static AtomicInteger atomicX = new AtomicInteger(0);

    public static void main(String[] args) {
        printMilliTime("Non volatile", () -> count());
        printMilliTime("Volatile", () -> countVolatile());
        printMilliTime("Atomic", () -> countAtomic());
        printMilliTime("Synchronized method", () -> countSynchronizedMethod());
        printMilliTime("Synchronized block", () -> countSynchronizedBlock());
    }

    private static void count() {
        for (int i = 0; i < COUNTS_QUANTITY; i++) {
            x++;
        }
    }

    private static void countVolatile() {
        for (int i = 0; i < COUNTS_QUANTITY; i++) {
            volatileX++;
        }
    }

    private static void countAtomic() {
        for (int i = 0; i < COUNTS_QUANTITY; i++) {
            atomicX.getAndIncrement();
        }
    }

    private static void countSynchronizedMethod() {
        for (int i = 0; i < COUNTS_QUANTITY; i++) {
            inc();
        }
    }

    private static synchronized void inc() {
        x++;
    }

    private static void countSynchronizedBlock() {
        for (int i = 0; i < COUNTS_QUANTITY; i++) {
            synchronized (SynchronizationBenchmark.class) {
                x++;
            }
        }
    }
}
