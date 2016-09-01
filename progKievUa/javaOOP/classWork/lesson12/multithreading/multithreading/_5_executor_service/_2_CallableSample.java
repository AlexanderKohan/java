package progKievUa.javaOOP.classWork.lesson12.multithreading.multithreading._5_executor_service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author Bohdan Vanchuhov
 */
public class _2_CallableSample {
    public static final int THREADS_QUANTITY = 4;

    public static void main(String[] args) {
        int[] array = {2, 3, 1, 10, 20, 7, 20, 2};

        int min = MinFinder.multithreadingMin(array, THREADS_QUANTITY);
        System.out.println(min);
    }
}

final class MinFinder {
    public static int min(int array[], int from, int to) {
        if (array.length == 0) return Integer.MIN_VALUE;

        int min = array[0];
        for (int i = from; i < to; i++) {
            min = Math.min(min, array[i]);
        }
        return min;
    }

    public static int min(int array[]) {
        return min(array, 0, array.length);
    }

    public static int multithreadingMin(int[] array, int threadsQuantity) {
        if (array.length == 0) return Integer.MIN_VALUE;

        ExecutorService executorService = Executors.newFixedThreadPool(threadsQuantity);
        List<Future<Integer>> minFutures = new ArrayList<>();

        int range = array.length / threadsQuantity;
        int from = 0;
        int to = range;
        for (int i = 0; i < threadsQuantity; i++) {
            MinFinderTask task = new MinFinderTask(array, from, to);
            Future<Integer> future = executorService.submit(task);
            minFutures.add(future);

            from += range;
            to += range;
        }
        executorService.shutdown();

        int min = array[0];
        for (Future<Integer> minFuture : minFutures) {
            try {
                Integer currentMin = minFuture.get();
                min = Math.min(min, currentMin);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        return min;
    }
}

class MinFinderTask implements Callable<Integer> {
    private int[] array;
    private int from;
    private int to;

    public MinFinderTask(int[] array, int from, int to) {
        this.array = array;
        this.from = from;
        this.to = to;
    }

    @Override
    public Integer call() throws Exception {
        int min = MinFinder.min(array, from, to);

        return min;
    }
}
