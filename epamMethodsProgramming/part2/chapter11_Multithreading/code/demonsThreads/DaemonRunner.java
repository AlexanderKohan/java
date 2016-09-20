package epamMethodsProgramming.part2.chapter11_Multithreading.code.demonsThreads;

/**
 * Created by Alexander on 9/17/2016.
 */
public class DaemonRunner {
    public static void main(String[ ] args) {
        SimpleThread usual = new SimpleThread();
        SimpleThread daemon = new SimpleThread();
        daemon.setDaemon(true);
        daemon.start();
        usual.start();
        System.out.println("последний оператор main");
    }
}
