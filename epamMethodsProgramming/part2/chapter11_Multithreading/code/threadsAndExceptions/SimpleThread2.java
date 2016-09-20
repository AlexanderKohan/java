package epamMethodsProgramming.part2.chapter11_Multithreading.code.threadsAndExceptions;

/**
 * Created by Alexander on 9/17/2016.
 */

public class SimpleThread2 extends Thread {
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.err.print(e);
        }
        System.out.println("end of SimpleThread2");
    }
}
