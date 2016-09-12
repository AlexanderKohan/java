package epamMethodsProgramming.part2.chapter10_Collections.code.collectionsAlgorithms;

import epamMethodsProgramming.part2.chapter10_Collections.code.arrayList.listIterator.Order;
import epamMethodsProgramming.part2.chapter10_Collections.code.comparator.fullItem.Item;

import java.util.Collections;
import java.util.HashSet;

/**
 * Created by Alexander on 9/12/2016.
 */
public class SafeSetRun {
    public static void main(String args[ ]) {
        HashSet orders;
// orders = new HashSet(); // заменяемый код на jdk1.4 и ниже
        // orders = Collections.checkedSet(new HashSet<Order>(), Order.class);
        //      orders.add(new Order(параметры));
// some code here
        //      orders.add(new Item(параметры)); // runtime error
    }
}
