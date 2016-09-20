package epamMethodsProgramming.part2.chapter11_Multithreading.code.barriers;

import java.util.Random;

/**
 * Created by Alexander on 9/17/2016.
 */
public class AuctionRunner {
    public static void main(String[ ] args) {
        Auction auction = new Auction();
        int startPrice = new Random().nextInt(100);
        for (int i = 0; i < auction.BIDS_NUMBER; i++) {
            Bid thread = new Bid(i, startPrice, auction.getBarrier());
            auction.add(thread);
            thread.start();
        }
    }
}
