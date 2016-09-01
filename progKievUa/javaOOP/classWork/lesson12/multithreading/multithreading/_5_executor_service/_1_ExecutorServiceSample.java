package progKievUa.javaOOP.classWork.lesson12.multithreading.multithreading._5_executor_service;



import progKievUa.javaOOP.classWork.lesson12.multithreading.multithreading.ConcurrencyUtils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author Bohdan Vanchuhov
 */
public class _1_ExecutorServiceSample {
    public static final int TREADS_QUANTITY = 3;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < TREADS_QUANTITY; i++) {
            Thread thread = new Thread(new Task(i));
            executorService.submit(thread);
        }
        executorService.shutdown();

        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main Thread is finished");
    }
}

class Task implements Runnable {
    public static final int COUNTS_QUANTITY = 3;
    private int id;

    public Task(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 0; i < COUNTS_QUANTITY; i++) {
            System.out.printf("Task %d (%d)\n", id, i);

            ConcurrencyUtils.sleep(500);
        }
    }
}
