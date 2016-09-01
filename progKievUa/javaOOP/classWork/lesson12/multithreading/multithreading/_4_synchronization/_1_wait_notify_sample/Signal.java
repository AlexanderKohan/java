package progKievUa.javaOOP.classWork.lesson12.multithreading.multithreading._4_synchronization._1_wait_notify_sample;

/**
 * @author Bohdan Vanchuhov
 */
public class Signal {
    private int counter;

    public Signal(int counter) {
        this.counter = counter;
    }

    public void await() {
        while (counter != 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void makeSignal() {
        counter--;

        if (counter == 0) {
            notifyAll();
        }
    }
}
