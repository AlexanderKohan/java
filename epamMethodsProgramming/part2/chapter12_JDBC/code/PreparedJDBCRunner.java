package epamMethodsProgramming.part2.chapter12_JDBC.code;

import epamMethodsProgramming.part2.chapter12_JDBC.code.simpleDJBCRunner.Abonent;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Alexander on 9/19/2016.
 */
public class PreparedJDBCRunner {
    public static void main(String[] args) {
        ArrayList<Abonent> list = new ArrayList<Abonent>() {
            {
                add(new Abonent(87, 1658468, "Кожух Дмитрий"));
                add(new Abonent(51, 8866711, "Буйкевич Александр"));
            }
        };
        DataBaseHelper dataBaseHelper = null;
        PreparedStatement preparedStatement = null;

        try {
            dataBaseHelper = new DataBaseHelper();
            preparedStatement = dataBaseHelper.getPreparedStatement();
            for (Abonent abonent : list) {
                dataBaseHelper.insertAbonent(preparedStatement, abonent);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dataBaseHelper.closeStatement(preparedStatement);
        }
    }
}
