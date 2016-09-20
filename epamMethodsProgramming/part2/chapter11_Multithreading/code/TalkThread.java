package epamMethodsProgramming.part2.chapter11_Multithreading.code;

/**
 * Created by Alexander on 9/17/2016.
 */
public class TalkThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Talking");
            try {
                Thread.sleep(7);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
