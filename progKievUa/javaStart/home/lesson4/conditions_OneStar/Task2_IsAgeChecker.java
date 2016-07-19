package progKievUa.javaStart.home.lesson4.conditions_OneStar;

/**
 * Created by Alexander on 29.06.2016.
 */
public class Task2_IsAgeChecker {
    public static void main(String[] args) {

        checkAge(22);
        checkAge(0);

    }

    private static void checkAge(int age) {
        if (age <= 120 && age > 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
