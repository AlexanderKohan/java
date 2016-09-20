package epamMethodsProgramming.part2.chapter11_Multithreading.code.semaphore;

/**
 * Created by Alexander on 9/17/2016.
 */
public class ResourсeException extends Exception {
    public ResourсeException() {
        super();
    }
    public ResourсeException(String message, Throwable cause) {
        super(message, cause);
    }
    public ResourсeException(String message) {
        super(message);
    }
    public ResourсeException(Throwable cause) {
        super(cause);
    }
}
