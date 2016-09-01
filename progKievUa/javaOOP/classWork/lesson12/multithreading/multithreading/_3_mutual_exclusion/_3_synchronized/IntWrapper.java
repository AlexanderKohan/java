package progKievUa.javaOOP.classWork.lesson12.multithreading.multithreading._3_mutual_exclusion._3_synchronized;

/**
 * @author Bohdan Vanchuhov
 */
public class IntWrapper {
    private int value;

    public IntWrapper(int value) {
        this.value = value;
    }

    public void increment() {
        synchronized (this) {
            value++;
        }
    }

    public synchronized void add(int delta) {
        value += delta;
    }

    public synchronized int getValue() {
        return value;
    }
}


