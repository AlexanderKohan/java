package progKievUa.javaOOP.home.lesson11.factorial;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexander on 8/29/2016.
 */
public class FactorialRunner {
    public static void main(String[] args) {

        int n = 100;
        int k = 1000;

        //singleThreadedRun(n, k);
        //multiThreadedRun(n,k);

        BigInteger factorial = Factorial.createFactorial(3);
        System.out.println(factorial);

        FactorialIO factorialIO = new FactorialIO(100);
        factorialIO.outputFactorialToFile(factorial);
    }

    private static void multiThreadedRun(int n, int k) {
        long start = System.currentTimeMillis();
        List<Thread> threads = new ArrayList<>();
        for (int i = 1; i <= 0; i++){
            FactorialN factorialN = new FactorialN(i,k);
            Thread thread = new Thread(factorialN);
            thread.start();
            threads.add(thread);
        }
        for (Thread thread : threads){
            try {
                thread.join();
            } catch (InterruptedException exception){
                exception.printStackTrace();
            }
        }
        long stop = System.currentTimeMillis();
        System.out.println("Multi threaded takes " + (stop - start) + " Millis");
    }

    private static void singleThreadedRun(int n, int k) {
        long start = System.currentTimeMillis();
        for (int i = 1; i <= n; i++) {
            FactorialN factorialN = new FactorialN(i, k);
            factorialN.run();
        }
        long stop = System.currentTimeMillis();
        System.out.println("Single threaded takes " + (stop - start) + " Millis");
    }
}