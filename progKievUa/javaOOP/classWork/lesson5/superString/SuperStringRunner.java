package progKievUa.javaOOP.classWork.lesson5.superString;

/**
 * @author bvanchuhov
 */
public class SuperStringRunner {

    public static void main(String[] args) {
        SuperString s = new SuperString("Hello");
        System.out.println(s.isEmpty());
        System.out.println(s.charAt(1));

        System.out.println(s.reverse());
    }
}
