package progKievUa.javaOOP.classWork.lesson12.multithreading.multithreading._2_interruption;


import progKievUa.javaOOP.classWork.lesson12.multithreading.multithreading.ConcurrencyUtils;

import java.math.BigInteger;

/**
 * @author Bohdan Vanchuhov
 */
public class InterruptionSample {
    public static void main(String[] args) {
        int n = 1_000_000;
        Thread thread = new Thread(new FactorialTask(n));
        thread.start();

        ConcurrencyUtils.sleep(500);

        thread.interrupt();
    }
}

class FactorialTask implements Runnable {
    private int n;

    public FactorialTask(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        BigInteger result = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            if (!Thread.interrupted()) {
                result = result.multiply(BigInteger.valueOf(i));

                if (i % 10_000 == 0) {
                    System.out.println(i);
                }
            } else {
                lastAction();
                return;
            }
        }

        System.out.println(result);
    }

    private void lastAction() {
        System.out.println("I'm finishing");
    }
}