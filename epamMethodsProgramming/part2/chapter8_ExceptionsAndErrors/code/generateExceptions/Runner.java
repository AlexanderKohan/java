package epamMethodsProgramming.part2.chapter8_ExceptionsAndErrors.code.generateExceptions;

/**
 * Created by Alexander on 9/4/2016.
 */
public class Runner {
    public static void main(String[] args) {
        SameResource f = new SameResource(); // SameResource f = null;
        try {// необязателен только при гарантированной корректности значения параметра
            Connector.loadResource(f);
        } catch (IllegalArgumentException e) {
            System.err.print("обработка unchecked-исключения вне метода: " + e);
        }
    }
}
