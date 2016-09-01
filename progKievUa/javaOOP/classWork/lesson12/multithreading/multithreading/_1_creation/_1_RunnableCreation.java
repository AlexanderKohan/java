package progKievUa.javaOOP.classWork.lesson12.multithreading.multithreading._1_creation;

/**
 * @author Bohdan Vanchuhov
 */
public class _1_RunnableCreation {
    public static void main(String[] args) {
        Runnable helloTask = new HelloTask();
        Thread thread = new Thread(helloTask);
        thread.start();

        System.out.println("Main is finished");
    }
}

class HelloTask implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
        }
        System.out.println("HelloTask is finished");
    }
}
