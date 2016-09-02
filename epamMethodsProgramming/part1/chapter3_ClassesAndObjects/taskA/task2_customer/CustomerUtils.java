package epamMethodsProgramming.part1.chapter3_ClassesAndObjects.taskA.task2_customer;

import java.util.*;

/**
 * Created by Alexander on 8/31/2016.
 */
public class CustomerUtils {

    static List<Customer> createCustomers() {

        List<Customer> customers = new ArrayList<>();

        customers.add(new Customer(0, "Aunson", "Julia", "Nanova", "Stryjskaya 52", 1243_5440, 2145_8253));
        customers.add(new Customer(0, "Stevenson", "Alexander", "Ivanov", "Leonenskaya 52", 7649_8640, 3245_3653));

        return customers;
    }

    public static List<Customer> findByCardNumber(List<Customer> customers, int from, int to) {

        List<Customer> list = new ArrayList<>();
        for (Customer customer : customers){
            if (customer.getCardNumber() >= from && customer.getCardNumber() <= to){
                list.add(customer);
            }
        }return list;
    }

    public static List<Customer> sortCustomersByName() {
        List<Customer> list = new ArrayList<>(createCustomers());
        Collections.sort(list, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });
        return list;
    }
}
