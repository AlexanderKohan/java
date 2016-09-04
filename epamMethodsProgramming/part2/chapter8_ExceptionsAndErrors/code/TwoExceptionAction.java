package epamMethodsProgramming.part2.chapter8_ExceptionsAndErrors.code;

/**
 * Created by Alexander on 9/4/2016.
 */
public class TwoExceptionAction {
    public void doAction() {
        try {
            int a = (int)(Math.random() * 2);
            System.out.println("a = " + a);
            int c[] = { 1/a }; // опасное место #1
            c[a] = 71; // опасное место #2
        } catch(ArithmeticException e) {
            System.err.println("деление на 0" + e);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println("out of bound: " + e);
        } // окончание try-catch блока
        System.out.println("after try-catch");
    }
//    объединить все идентичные ин-
//    струкции в одну, используя для разделения оператор «|».
//    try {
//// some operations
//    } catch(NumberFormatException | ClassNotFoundException | InstantiationException e) {
//        e.printStackTrace();
//    }
}
