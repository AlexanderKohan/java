package progKievUa.javaOOP.classWork.lesson4.string_pool;

/**
 * Created on 14.05.2015
 *
 * @author Bohdan Vanchuhov
 */
public class StringPoolSample {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2);

        s1 += ", world";
        s2 += ", world";
        System.out.println(s1 == s2);

        s1 = s1.intern();
        s2 = s2.intern();
        System.out.println(s1 == s2);
    }
}
