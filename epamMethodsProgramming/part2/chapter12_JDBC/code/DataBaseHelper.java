package epamMethodsProgramming.part2.chapter12_JDBC.code;

import epamMethodsProgramming.part2.chapter12_JDBC.code.simpleDJBCRunner.Abonent;
import epamMethodsProgramming.part2.chapter12_JDBC.code.simpleDJBCRunner.ConnectorDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Alexander on 9/19/2016.
 */
public class DataBaseHelper {

    private final static String SQL_INSERT = "INSERT INTO phonebook(idphonebook, lastname,phone)VALUES(?,?,?)";
    private Connection connection;

    public DataBaseHelper() throws SQLException {
        connection = ConnectorDB.getConnection();
    }

    public PreparedStatement getPreparedStatement() {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(SQL_INSERT);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return preparedStatement;
    }

    public boolean insertAbonent(PreparedStatement preparedStatement, Abonent abonent) {
        boolean flag = false;

        try {
            preparedStatement.setInt(1, abonent.getId());
            preparedStatement.setString(2, abonent.getLastName());
            preparedStatement.setInt(3, abonent.getPhone());
            preparedStatement.executeUpdate();
            flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public void closeStatement(PreparedStatement preparedStatement) {
        if (preparedStatement != null) {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
