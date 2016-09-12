package epamMethodsProgramming.part2.chapter10_Collections.code.linkedListQueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Alexander on 9/12/2016.
 */
public class OrderQueueAction {
    public static void main(String[] args) {
        LinkedList<Order> orders = new LinkedList<Order>() {
            {
                add(new Order(231, 12.f));
                add(new Order(389, 2.9f));
                add(new Order(217, 1.7f));
            }
        };
        Queue<Order> queueA = orders; // создание очереди
        queueA.offer(new Order(222, 9.7f)); // элемент не добавится
        orderProcessing(queueA); // обработка очереди
        if (queueA.isEmpty()) {
            System.out.println("Queue of Orders is empty");
        }
    }

    public static void orderProcessing(Queue<Order> queue) { // заменить void -> boolean
        Order ob = null;
// заменить while -> do{} while
        while ((ob = queue.poll()) != null) { // извлечение с удалением
            System.out.println("Order #" + ob.getOrderId() + " is processing");
// verifying and processing
        }
    }
}
