package epamMethodsProgramming.part2.chapter11_Multithreading.code.threadsAndExceptions;

/**
 * Created by Alexander on 9/17/2016.
 */

public class ExceptionThreadDemo1 {
    public static void main(String[ ] args) throws InterruptedException {
        new ExceptThread1().start();
        Thread.sleep(1000);
        System.out.println("end of main");
    }
}
