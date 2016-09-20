package epamMethodsProgramming.part2.chapter12_JDBC.code.logicLevelDAO;

import epamMethodsProgramming.part2.chapter12_JDBC.code.dataAccessObject.ConnectionPool;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by Alexander on 9/19/2016.
 */
public class SomeLogic {
    public void doLogic(int id) throws SQLException {
// 1. создание-получение соединения
        Connection conn = ConnectionPool.getConnection();
// 2. открытие транзакции
        conn.setAutoCommit(false);
// 3. инициализация необходимых экземпляров DAO
        AbonentDAO abonentDAO = new AbonentDAO(conn);
        PaymentDAO paymentDAO = new PaymentDAO(conn);
// 4. выполнение запросов
        abonentDAO.findAll();
        paymentDAO.findEntityById(id);
        paymentDAO.delete(id);
// 5. закрытие транзакции
        conn.commit();
// 6. закрытие-возвращение соединения
        conn.close();
    }
}
