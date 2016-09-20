package epamMethodsProgramming.part2.chapter11_Multithreading.code.alternativeSynchronized;

import java.util.concurrent.TimeUnit;

/**
 * Created by Alexander on 9/18/2016.
 */
public class SynchroMain {
    public static void main(String[ ] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            DoubleResource resource = new DoubleResource();
            new ResThread("a", resource).start();
            new ResThread("Z", resource).start();
            new ResThread("#", resource).start();
            TimeUnit.MILLISECONDS.sleep(1_000);
            System.out.println(resource);
        }
    }
}
