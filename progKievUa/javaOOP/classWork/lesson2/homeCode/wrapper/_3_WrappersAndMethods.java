package progKievUa.javaOOP.classWork.lesson2.homeCode.wrapper;

/**
 * Created on 27.04.2015
 *
 * @author Bohdan Vanchuhov
 */
public class _3_WrappersAndMethods {
    public static void main(String[] args) {
        f(10L);
    }

    public static void f(int x) {
        System.out.println("int");
    }

    public static void f(Integer x) {
        System.out.println("Integer");
    }

    public static void f(long x) {
        System.out.println("long");
    }

    public static void f(Long x) {
        System.out.println("Long");
    }
}
