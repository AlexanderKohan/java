package progKievUa.javaOOP.classWork.lesson12.multithreading.multithreading._3_mutual_exclusion._2_atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Bohdan Vanchuhov
 */
public class AtomicCounterSample {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger atomicInteger = new AtomicInteger();

        Thread thread1 = new Thread(new AtomicCounter(atomicInteger));
        Thread thread2 = new Thread(new AtomicCounter(atomicInteger));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(atomicInteger.get());
    }
}

class AtomicCounter implements Runnable {
    private AtomicInteger atomicInteger;

    public AtomicCounter(AtomicInteger atomicInteger) {
        this.atomicInteger = atomicInteger;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            atomicInteger.incrementAndGet();
        }
    }
}