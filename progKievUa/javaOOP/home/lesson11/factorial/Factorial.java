package progKievUa.javaOOP.home.lesson11.factorial;

import java.math.BigInteger;

/**
 * Created by Alexander on 8/29/2016.
 */
public class Factorial {

    public static BigInteger createFactorial(int value) {

        BigInteger factorial = BigInteger.ONE;

        if (value >= 1) {
            for (int i = 1; i <= value; i++) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }
            return factorial;
        } else if (value == 0) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(-1);
        }
    }
}
