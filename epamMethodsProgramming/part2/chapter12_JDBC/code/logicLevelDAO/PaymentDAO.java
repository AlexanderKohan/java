package epamMethodsProgramming.part2.chapter12_JDBC.code.logicLevelDAO;


import epamMethodsProgramming.part2.chapter11_Multithreading.code.waitNotifyNotifyAll.Payment;

import java.sql.Connection;
import java.util.List;

/**
 * Created by Alexander on 9/19/2016.
 */
public class PaymentDAO extends AbstractDAO <Payment> {
    public PaymentDAO(Connection connection) {
        super(connection);
    }
    // реализации методов
    @Override
    public List<Payment> findAll() {
        return null;
    }

    @Override
    public Payment findEntityById(int id) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean delete(Payment entity) {
        return false;
    }

    @Override
    public boolean create(Payment entity) {
        return false;
    }

    @Override
    public Payment update(Payment entity) {
        return null;
    }
}
