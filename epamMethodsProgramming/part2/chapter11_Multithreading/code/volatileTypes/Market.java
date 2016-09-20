package epamMethodsProgramming.part2.chapter11_Multithreading.code.volatileTypes;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Alexander on 9/17/2016.
 */
public class Market extends Thread {
    private AtomicLong index;
    public Market(AtomicLong index) {
        this.index = index;
    }
    public AtomicLong getIndex() {
        return index;
    }
    @Override
    public void run() {
        Random random = new Random();
        try {
            while (true) {
                index.addAndGet(random.nextInt(10));
                Thread.sleep(random.nextInt(500));
                index.addAndGet(-1 * random.nextInt(10));
                Thread.sleep(random.nextInt(500));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
