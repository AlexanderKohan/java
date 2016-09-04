package epamMethodsProgramming.part2.chapter8_ExceptionsAndErrors.code.ownExceptions;

/**
 * Created by Alexander on 9/4/2016.
 */
public class CoinLogicException extends Exception {
    public CoinLogicException() {
    }
    public CoinLogicException(String message, Throwable cause) {
        super(message, cause);
    }
    public CoinLogicException(String message) {
        super(message);
    }
    public CoinLogicException (Throwable cause) {
        super(cause);
    }
}
