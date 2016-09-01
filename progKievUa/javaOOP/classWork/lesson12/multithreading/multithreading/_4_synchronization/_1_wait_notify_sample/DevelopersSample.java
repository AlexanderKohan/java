package progKievUa.javaOOP.classWork.lesson12.multithreading.multithreading._4_synchronization._1_wait_notify_sample;

import progKievUa.javaOOP.classWork.lesson12.multithreading.multithreading.ConcurrencyUtils;

import java.util.Random;

/**
 * @author Bohdan Vanchuhov
 */

public class DevelopersSample {
    public static final int DEVELOPERS_QUANTITY = 5;

    public static void main(String[] args) {
        Signal codeDoneSignal = new Signal(DEVELOPERS_QUANTITY);

        for (int i = 0; i < DEVELOPERS_QUANTITY; i++) {
            new Thread(new Developer(codeDoneSignal))
                    .start();
        }

    }
}

class Developer implements Runnable {
    private Signal codeDoneSignals;

    public Developer(Signal codeDoneSignals) {
        this.codeDoneSignals = codeDoneSignals;
    }

    @Override
    public void run() {
        writeCode();
        codeDoneSignals.makeSignal();

        codeDoneSignals.await();
        System.out.println("Yahoo");
    }

    private void writeCode() {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            System.out.println("Code is writing by " + Thread.currentThread().getName());
            ConcurrencyUtils.sleep(random.nextInt(500));
        }
    }
}
