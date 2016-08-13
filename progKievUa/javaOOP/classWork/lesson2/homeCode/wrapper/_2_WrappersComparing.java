package progKievUa.javaOOP.classWork.lesson2.homeCode.wrapper;

/**
 * Created on 27.04.2015
 *
 * @author Bohdan Vanchuhov
 */
public class _2_WrappersComparing {
    public static void main(String[] args) {
        Integer x1 = 10;
        Integer x2 = 10;

        Integer y1 = 200;
        Integer y2 = 200;

        System.out.println(x1 == x2);
        System.out.println(y1 == y2);
        System.out.println();

        System.out.println(x1.equals(x2));
        System.out.println(y1.equals(y2));
    }
}
