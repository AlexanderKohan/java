package epamMethodsProgramming.part2.chapter12_JDBC.code.classesDAO;

import java.sql.Statement;

/**
 * Created by Alexander on 9/19/2016.
 */
public abstract class AbstractDAO {
    protected WrapperConnector connector;
    // методы добавления, поиска, замены, удаления
// методы закрытия коннекта и Statement
    public void close() {
        connector.closeConnection();
    }
    protected void closeStatement(Statement statement) {
        connector.closeStatement(statement);
    }
}