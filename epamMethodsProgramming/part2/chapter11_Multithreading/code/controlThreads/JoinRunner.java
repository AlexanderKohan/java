package epamMethodsProgramming.part2.chapter11_Multithreading.code.controlThreads;

/**
 * Created by Alexander on 9/17/2016.
 */
public class JoinRunner {
    static {
        System.out.println("Старт потока main");
    }

    public static void main(String[] args) {
        JoinThread t1 = new JoinThread("First");
        JoinThread t2 = new JoinThread("Second");
        t1.start();
        t2.start();
        try {
            t1.join(); // поток main остановлен до окончания работы потока t1
            //     t1.join(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());// имя текущего потока
    }
}
