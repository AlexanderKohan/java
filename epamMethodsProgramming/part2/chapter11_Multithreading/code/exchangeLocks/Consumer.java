package epamMethodsProgramming.part2.chapter11_Multithreading.code.exchangeLocks;

/**
 * Created by Alexander on 9/17/2016.
 */
public class Consumer extends Subject implements Runnable {
    public Consumer(String name, Item item) {
        super(name, item);
    }

    public void run() {
        try {
            synchronized (item) { // блок синхронизации не нужен, но показателен
                int requiredNumber = item.getNumber();
                item = exchanger.exchange(item); // обмен
                if (requiredNumber >= item.getNumber()) {
                    System.out.println("Consumer " + getName()
                            + " повышает стоимость товара");
                } else {
                    System.out.println("Consumer " + getName()
                            + " снижает стоимость товара");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
