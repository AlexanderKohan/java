package epamMethodsProgramming.part2.chapter12_JDBC.code.dataAccessObject;

import epamMethodsProgramming.part2.chapter12_JDBC.code.simpleDJBCRunner.Entity;
import java.util.List;

/**
 * Created by Alexander on 9/19/2016.
 */

public abstract class AbstractDAO <K, T extends Entity> {
    public abstract List<T> findAll();
    public abstract T findEntityById(K id);
    public abstract boolean delete(K id);
    public abstract boolean delete(T entity);
    public abstract boolean create(T entity);
    public abstract T update(T entity);
}
