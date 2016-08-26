package progKievUa.javaOOP.classWork.lesson10.minServlet;

/**
 * @author bvanchuhov
 */
public final class Validator {
    private Validator() {}

    public static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
