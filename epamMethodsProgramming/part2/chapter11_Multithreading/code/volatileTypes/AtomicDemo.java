package epamMethodsProgramming.part2.chapter11_Multithreading.code.volatileTypes;

import sun.applet.Main;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Alexander on 9/17/2016.
 */

public class AtomicDemo {
    private static final int NUMBER_BROKERS = 30;
    public static void main(String[ ] args) {
        Market market = new Market(new AtomicLong(100));
        market.start();
        for (int i = 0; i < NUMBER_BROKERS; i++) {
            new Broker(market).start();
        }
    }
}
