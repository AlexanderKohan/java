package epamMethodsProgramming.part2.chapter8_ExceptionsAndErrors.code.generateExceptions;

/**
 * Created by Alexander on 9/4/2016.
 */
public class Connector {
    public static void loadResource(SameResource f) {
        if (f == null || !f.exists() || !f.isCreate()) {
            throw new IllegalArgumentException(); /* генерация исключения */
// или собственное, н-р, throw new IllegalResourceException();
        }
// more code
    }
}
