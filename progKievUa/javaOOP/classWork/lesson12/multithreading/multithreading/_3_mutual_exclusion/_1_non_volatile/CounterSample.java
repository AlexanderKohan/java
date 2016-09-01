package progKievUa.javaOOP.classWork.lesson12.multithreading.multithreading._3_mutual_exclusion._1_non_volatile;

/**
 * @author Bohdan Vanchuhov
 */
public class CounterSample {
    public static final int COUNTS_QUANTITY = 1_000_000;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Counter());
        Thread thread2 = new Thread(new Counter());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(A.x);
    }
}

class A {
    public static int x = 0;
}

class Counter implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < CounterSample.COUNTS_QUANTITY; i++) {
            inc();
        }
    }

    public static void inc() {
        A.x++;
    }
}

