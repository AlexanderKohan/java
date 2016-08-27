package progKievUa.javaOOP.classWork.lesson11.concurrent.creating;

/**
 * @author Bohdan Vanchuhov
 */
public class _2_AnonymousRunnableCreation {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                doTask();
            }
        });
        thread.start();

        System.out.println("Main Thread is finished");
    }

    public static void doTask() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
        }
    }
}
