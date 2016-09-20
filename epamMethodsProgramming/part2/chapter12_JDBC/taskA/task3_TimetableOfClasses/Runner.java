package epamMethodsProgramming.part2.chapter12_JDBC.taskA.task3_TimetableOfClasses;

import com.mysql.jdbc.*;

import java.sql.*;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 * Created by Alexander on 9/20/2016.
 */

public class Runner {

    private static final String GET_TEACHERS = "SELECT * FROM teachers";

    public static void main(String[] args) throws SQLException {

        Connector connector = new Connector();

        try {
            Driver driver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(driver);

            if (!connector.getConnection().isClosed()) {
                System.out.println("Сonnection with DB ESTABLISHED");
            }

//            Utils.getTeachersGivenDayAudience(connector, 5, 504);
//            Utils.getTeachersDoNotTeachInDay(connector, 4);
            Utils.getDaysAmountOfSubjects(connector, 2);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connector != null) {
                try {
                    connector.getConnection().close();
                    System.out.println("Сonnection with DB close");
                } catch (SQLException e) {
                    System.err.println("Сonnection close error: " + e);
                }
            }
        }
    }
}
