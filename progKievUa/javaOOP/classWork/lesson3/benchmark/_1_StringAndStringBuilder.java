package progKievUa.javaOOP.classWork.lesson3.benchmark;

/**
 * @author Bohdan Vanchuhov
 */
public class _1_StringAndStringBuilder {
    public static final int ADDING_QUANTITY = 1000_000;
    public static final String STRING_FOR_APPEND = "1";

    public static void main(String[] args) {
        System.out.println(useStringBuilderTime());
        System.out.println(useStringTime());
    }

    private static void useStringBuilder() {
        String s = "";
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < ADDING_QUANTITY; i++) {
            sb.append(STRING_FOR_APPEND);
        }
    }

    private static void useString() {
        String s = "";
        for (int i = 0; i < ADDING_QUANTITY; i++) {
            s += STRING_FOR_APPEND;
        }
    }

    private static long useStringBuilderTime() {
        long start = System.currentTimeMillis();

        useStringBuilder();

        long finish = System.currentTimeMillis();
        return finish - start;
    }

    private static long useStringTime() {
        long start = System.currentTimeMillis();

        useString();

        long finish = System.currentTimeMillis();
        return finish - start;
    }
}
