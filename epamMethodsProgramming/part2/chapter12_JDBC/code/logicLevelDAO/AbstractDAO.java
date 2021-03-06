package epamMethodsProgramming.part2.chapter12_JDBC.code.logicLevelDAO;

import epamMethodsProgramming.part2.chapter12_JDBC.code.simpleDJBCRunner.Entity;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * Created by Alexander on 9/19/2016.
 */
public abstract class AbstractDAO <T extends Entity> {
    protected Connection connection;
    public AbstractDAO(Connection connection) {
        this.connection = connection;
    }
    public abstract List<T> findAll();
    public abstract T findEntityById(int id);
    public abstract boolean delete(int id);
    public abstract boolean delete(T entity);
    public abstract boolean create(T entity);
    public abstract T update(T entity);
    public void close(Statement st) {
        try {
            if (st != null) {
                st.close();
            }
        } catch (SQLException e) {
// лог о невозможности закрытия Statement
        }
    }
}
