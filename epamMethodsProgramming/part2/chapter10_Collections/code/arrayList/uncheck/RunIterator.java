package epamMethodsProgramming.part2.chapter10_Collections.code.arrayList.uncheck;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Alexander on 9/9/2016.
 */
public class RunIterator {
    public static void main(String[ ] args) {
        ArrayList<Order> orders = new ArrayList<Order>() {
            {
                add(new Order(231, 12.f));
                add(new Order(389, 2.9f));
                add(new Order(217, 1.7f));
            }
        };
        FindOrder fo = new FindOrder();
        List<Order> res = fo.findBiggerAmountOrder(10f, orders);
        System.out.println(res);
    }
}

class FindOrder {
    public List<Order> findBiggerAmountOrder(float bigAmount, List<Order> orders) {
        ArrayList<Order> bigPrices = new ArrayList<Order>();
        Iterator<Order> it = orders.iterator();
        while (it.hasNext()) {
            Order current = it.next();
            if(current.getAmount() >= bigAmount) {
                bigPrices.add(current);
            }
        }
        return bigPrices;
    }
}
