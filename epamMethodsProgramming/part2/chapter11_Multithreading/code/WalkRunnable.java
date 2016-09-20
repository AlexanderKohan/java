package epamMethodsProgramming.part2.chapter11_Multithreading.code;

/**
 * Created by Alexander on 9/17/2016.
 */
public class WalkRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Walking");
            try {
                Thread.sleep(7);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
    }
}

class WalkTalk {
    public static void main(String[] args) {
// новые объекты потоков
        TalkThread talk = new TalkThread();
        Thread walk = new Thread(new WalkRunnable());
// запуск потоков
        talk.start();
        walk.start();
// WalkRunnable w = new WalkRunnable(); // просто объект, не поток
// w.run(); или talk.run(); // выполнится метод, но поток не запустится!
    }
}
