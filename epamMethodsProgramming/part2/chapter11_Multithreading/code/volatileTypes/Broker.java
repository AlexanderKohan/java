package epamMethodsProgramming.part2.chapter11_Multithreading.code.volatileTypes;

/**
 * Created by Alexander on 9/17/2016.
 */
public class Broker extends Thread {
    private Market market;
    private static final int PAUSE = 500; // in millis

    public Broker(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Current index: " + market.getIndex());
                Thread.sleep(PAUSE);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
