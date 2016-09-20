package epamMethodsProgramming.part2.chapter11_Multithreading.taskA.task1_Port;

import java.util.Random;

/**
 * Created by Alexander on 9/18/2016.
 */
public class Runner {
    public static void main(String[] args) {
        System.out.println("Synchronized variant");
        emulateWork(new SynchronizedDock(5,100));
        System.out.println("---------------------------------------------------------");
        System.out.println("Lock variant");
        emulateWork(new LockDock(5, 100));
    }

    public static void emulateWork(Dock dock) {
        Thread[] threads = new Thread[20];
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int maxWeight = 10 + random.nextInt(30);
            int currentWeight = random.nextInt(maxWeight);

            Ship ship = new Ship(maxWeight, currentWeight);
            threads[i] = new Thread(new ShipThread(dock, ship));
        }
        //         run
        for (int i = 0; i < 20; i++) {
            threads[i].start();
        }

        // wait
        for (int i = 0; i < 20; i++) {
            while (threads[i].isAlive()) {
                System.out.println("waiting" );
            }
        }
    }
}
