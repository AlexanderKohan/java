package epamMethodsProgramming.part2.chapter10_Collections.code.linkedListQueue;

/**
 * Created by Alexander on 9/12/2016.
 */
public class Order implements Comparable<Order> {
    private int orderId;
    private float amount;

    // поля и методы описания подробностей заказа
    public Order(int orderId, float amount) {
        super();
        this.orderId = orderId;
        this.amount = amount;
    }

    public int getOrderId() {
        return orderId;
    }

    public float getAmount() {
        return amount;
    }

    // реализация метода интерфейса Comparable
    @Override
    public int compareTo(Order ob) {
        return this.orderId - ob.orderId;
    }

    @Override
    public String toString() {
        return "Order [orderId =" + orderId + ", amount=" + amount + "]";
    }
}
