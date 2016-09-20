package epamMethodsProgramming.part2.chapter11_Multithreading.code.executorServiceAndCallable;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * Created by Alexander on 9/18/2016.
 */
public class CalcCallable implements Callable<Number> {
    @Override
    public Number call() throws Exception {
        Number res = new Random().nextGaussian(); // имитация вычислений
        return res;
    }
}
