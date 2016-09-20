package epamMethodsProgramming.part2.chapter11_Multithreading.code.threadsAndExceptions;

/**
 * Created by Alexander on 9/17/2016.
 */
public class ExceptThread1 extends Thread {
    public void run() {
        boolean flag = true;
        if (flag) {
            throw new RuntimeException();
        }
        System.out.println("end of ExceptThread1");
    }
}
