package progKievUa.javaOOP.classWork.lesson12.multithreading.multithreading._2_states;

import progKievUa.javaOOP.classWork.lesson12.multithreading.multithreading.ConcurrencyUtils;

/**
 * @author Bohdan Vanchuhov
 */
public class StatesSample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Task());
        System.out.println("1. " + thread.getState());

        thread.start();

        for (int i = 2; i <= 6; i++) {
            Thread.sleep(5000);
            System.out.println(i + ". " + thread.getState());
        }
    }
}

class Task implements Runnable {
    @Override
    public void run() {
        try {
            doTask();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void doTask() throws InterruptedException {
        System.out.println("Task: wait input");
        ConcurrencyUtils.wainInput("1");

        System.out.println("Task: join()");
        Thread thread1 = new Thread(new WaitingInputTask("1"));
        thread1.start();
        thread1.join();

        System.out.println("Task: join(long)");
        Thread thread2 = new Thread(new WaitingInputTask("1"));
        thread2.start();
        thread2.join(4000);

        System.out.println("Task: sleep(long)");
        Thread.sleep(4000);
    }
}

class WaitingInputTask implements Runnable {
    private String message;

    public WaitingInputTask(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        ConcurrencyUtils.wainInput(message);
    }
}
