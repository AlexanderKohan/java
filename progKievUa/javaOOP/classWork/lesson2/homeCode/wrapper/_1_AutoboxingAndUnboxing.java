package progKievUa.javaOOP.classWork.lesson2.homeCode.wrapper;

/**
 * @author Bohdan Vanchuhov
 */
public class _1_AutoboxingAndUnboxing {
    public static void main(String[] args) {
        Integer x = 100;        // Integer x = Integer.valueOf(100);
        Integer y = x + 10;     // Integer y = Integer.valueOf(x.intValue() + 10);

        y += 1000;              // y = Integer.valueOf(y.intValue() + 1000);

        System.out.println(x);
        System.out.println(y);
    }
}
