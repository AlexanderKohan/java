package epamMethodsProgramming.part2.chapter10_Collections.code.arrayList.listIterator;

import epamMethodsProgramming.part2.chapter10_Collections.code.arrayList.uncheck.Item;

import java.util.ArrayList;

/**
 * Created by Alexander on 9/10/2016.
 */
public class Order extends ArrayList<Item> {
    private int orderId;
    // private float amount; // по прежнему не нужен, т.к. сумму можно вычислить
    public Order(ArrayList<Item> c) {
        super(c);
    }
    public Order(int orderId, ArrayList<? extends Item> c) {
        super(c);
        this.orderId = orderId;
    }
    public int getOrderId() {
        return orderId;
    }
    public void setOrderId (int orderId) {
        this. orderId = orderId;
    }
}
