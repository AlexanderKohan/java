package progKievUa.javaOOP.classWork.lesson12.multithreading.multithreading;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bohdan Vanchuhov
 */
public class ThreadList {
    private List<Thread> list = new ArrayList<>();

    public void add(Thread thread) {
        list.add(thread);
    }

    public void startAll() {
        for (Thread thread : list) {
            thread.start();
        }
    }

    public void joinAll() throws InterruptedException {
        for (Thread thread : list) {
            thread.join();
        }
    }
}
