package epamMethodsProgramming.part2.chapter12_JDBC.code.logicLevelDAO;

import epamMethodsProgramming.part2.chapter12_JDBC.code.simpleDJBCRunner.Abonent;

import java.sql.Connection;
import java.util.List;

/**
 * Created by Alexander on 9/19/2016.
 */
public class AbonentDAO extends AbstractDAO <Abonent> {
    public AbonentDAO(Connection connection) {
        super(connection);
    }
    // реализации методов
    @Override
    public List<Abonent> findAll() {
        return null;
    }

    @Override
    public Abonent findEntityById(int id) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean delete(Abonent entity) {
        return false;
    }

    @Override
    public boolean create(Abonent entity) {
        return false;
    }

    @Override
    public Abonent update(Abonent entity) {
        return null;
    }
}
