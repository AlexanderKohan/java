package epamMethodsProgramming.part2.chapter12_JDBC.taskA.task3_TimetableOfClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * Created by Alexander on 9/20/2016.
 */
public class Connector {

    private static final String HOST = "jdbc:mysql://localhost:3306/timetable_of_classes?useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    private Connection connection;

    public Connector() {
        try {
            connection = DriverManager.getConnection(HOST, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

}
