package epamMethodsProgramming.part1.chapter3_ClassesAndObjects.taskA.task2_customer;

import java.util.List;

/**
 * Created by Alexander on 8/31/2016.
 */

public class CustomerRunner {
    public static void main(String[] args) {

        List<Customer> customers = CustomerUtils.createCustomers();

        System.out.println(CustomerUtils.sortCustomersByName());
        System.out.println("-------------------------");
        System.out.println(CustomerUtils.findByCardNumber(customers, 0_000_0000, 7_000_0000));
    }
}
