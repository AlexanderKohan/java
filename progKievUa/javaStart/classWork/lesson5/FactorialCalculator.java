package progKievUa.javaStart.classWork.lesson5;

import java.math.BigInteger;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.valueOf;
/**
 * Created by Alexander on 05.07.2016.
 */
public class FactorialCalculator {

    public static void main(String[] args) {
        System.out.println("3! = " + shortFactorial(3));
        System.out.println("10! = " + shortFactorial(10));

        System.out.println("100! = " + factorial(100));
        System.out.println("1000! = " + factorial(1000));
    }

    public static BigInteger factorial(int n) {
        checkFactorialArg(n);

        BigInteger factorial = ONE;
        for (int i = 2; i <= n; i++) {
            factorial = factorial.multiply(valueOf(i));
        }

        return factorial;
    }

    private static void checkFactorialArg(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n should be not negative, but actually is " + n);
        }
    }

    public static long shortFactorial(int n) {
        checkShortFactorialArg(n);

        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }

    private static void checkShortFactorialArg(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n should be in the range [0..20], but actually is " + n);
        }
    }
}