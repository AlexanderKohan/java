package progKievUa.javaOOP.classWork.lesson12.multithreading.multithreading._3_mutual_exclusion._3_synchronized;

/**
 * @author Bohdan Vanchuhov
 */
public class SynchronizedSample {
    public static void main(String[] args) throws InterruptedException {
        IntWrapper wrapper = new IntWrapper(0);

        Thread thread1 = new Thread(new Incrementer(wrapper));
        Thread thread2 = new Thread(new Incrementer(wrapper));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(wrapper.getValue());
    }
}

class Incrementer implements Runnable {
    private IntWrapper wrapper;

    public Incrementer(IntWrapper wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            wrapper.increment();
        }
    }
}




