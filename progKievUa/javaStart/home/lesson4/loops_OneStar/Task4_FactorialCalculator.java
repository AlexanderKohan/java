package progKievUa.javaStart.home.lesson4.loops_OneStar;

/**
 * Created by Alexander on 29.06.2016.
 */
public class Task4_FactorialCalculator {
    public static void main(String[] args) {
        int n = 15;

        if (n < 1 || n >= 20) {
            throw new IllegalArgumentException("factorial must be in the range [0..20] " + n);
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
