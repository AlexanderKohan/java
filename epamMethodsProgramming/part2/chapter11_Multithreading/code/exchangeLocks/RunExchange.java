package epamMethodsProgramming.part2.chapter11_Multithreading.code.exchangeLocks;

/**
 * Created by Alexander on 9/17/2016.
 */
public class RunExchange {
    public static void main(String[ ] args) {
        Item ss1 = new Item(34, 2200);
        Item ss2 = new Item(34, 2100);
        new Thread(new Producer("HP ", ss1)).start();
        new Thread(new Consumer("RETAIL Trade", ss2)).start();
    }
}
