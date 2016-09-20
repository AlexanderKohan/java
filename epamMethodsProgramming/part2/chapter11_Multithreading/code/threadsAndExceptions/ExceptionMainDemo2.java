package epamMethodsProgramming.part2.chapter11_Multithreading.code.threadsAndExceptions;

/**
 * Created by Alexander on 9/17/2016.
 */
public class ExceptionMainDemo2 {
    public static void main(String[ ] args) {
        new SimpleThread2().start();
        System.out.println("end of main with exception");
        throw new RuntimeException();
    }
}
