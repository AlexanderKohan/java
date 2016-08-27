package progKievUa.javaOOP.classWork.lesson11.concurrent.creating;

import static progKievUa.javaOOP.classWork.lesson11.concurrent.ConcurrencyUtils.sillyWork;

/**
 * @author Bohdan Vanchuhov
 */
public class _5_SillyWorkSample {
    public static final int COUNTS_QUANTITY = 5;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < COUNTS_QUANTITY; i++) {
                    sillyWork(100);
                    System.out.println("Hello");
                }
            }
        });
        thread.start();

        System.out.println("Main Thread is finished");
    }
}
