package epamMethodsProgramming.part2.chapter11_Multithreading.code.waitNotifyNotifyAll;

import epamMethodsProgramming.part2.chapter12_JDBC.code.simpleDJBCRunner.Entity;

import java.util.Scanner;

/**
 * Created by Alexander on 9/17/2016.
 */

public class Payment extends Entity {
    private int amount;
    private boolean close;
    public int getAmount() {
        return amount;
    }
    public boolean isClose() {
        return close;
    }
    public synchronized void doPayment() {
        try {
            System.out.println("Start payment:");
            while (amount <= 0) {
                this.wait(); // остановка потока и освобождение блокировки
// после возврата блокировки выполнение будет продолжено
            }
// код выполнения платежа
            close = true;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Payment is closed : " + close);
    }
    public void initAmount() {
        Scanner scan = new Scanner(System.in);
        amount = scan.nextInt();
    }
}
