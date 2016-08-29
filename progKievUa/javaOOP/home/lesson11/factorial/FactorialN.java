package progKievUa.javaOOP.home.lesson11.factorial;

import java.math.BigInteger;

/**
 * Created by Alexander on 8/29/2016.
 */
public class FactorialN implements Runnable {
    private final int i;
    private final int k;

    public FactorialN(int i, int k) {
        this.i = i;
        this.k = k;
    }

    @Override
    public void run() {
        Factorial factorial = new Factorial();
        BigInteger createFactorial = factorial.createFactorial(i * k);

        FactorialIO factorialIO = new FactorialIO(i * k);
        factorialIO.outputFactorialToFile(createFactorial);
    }
}
