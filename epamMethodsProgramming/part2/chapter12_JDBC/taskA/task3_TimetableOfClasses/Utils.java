package epamMethodsProgramming.part2.chapter12_JDBC.taskA.task3_TimetableOfClasses;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Alexander on 9/20/2016.
 */
public class Utils {

    //    Вывести информацию о преподавателях, работающих в заданный день
//    недели в заданной аудитории.
    public static void getTeachersGivenDayAudience(Connector connector, int dayOfTheWeek, int audience) throws SQLException {
        PreparedStatement preparedStatementTeachers;
        String GET_TEACHERS = "SELECT * FROM subjects,teachers WHERE teachers.subjects=subjects.title";
        preparedStatementTeachers = connector.getConnection().prepareStatement(GET_TEACHERS);
        ResultSet resultSetTeachers = preparedStatementTeachers.executeQuery();

        while (resultSetTeachers.next()) {
            if (resultSetTeachers.getInt("day_of_the_week") == dayOfTheWeek && resultSetTeachers.getInt("audience") == audience) {
                String fullName = resultSetTeachers.getString("full_name");
                String subject = resultSetTeachers.getString("subjects");
                int numberOfPairsPerWeek = resultSetTeachers.getInt("number_of_pairs_per_week");
                int amountOfStudents = resultSetTeachers.getInt("amount_of_students");

                System.out.println("{ full name: " + fullName + " , subject: " + subject
                        + ", number of Pairs Per Week: " + numberOfPairsPerWeek + ", amount of students: " + amountOfStudents + ", day of the week: " + dayOfTheWeek + ", audience: " + audience + "}");
            }
        }
    }

    //    Вывести информацию о преподавателях, которые не ведут занятия в за-
//    данный день недели.
    public static void getTeachersDoNotTeachInDay(Connector connector, int day) throws SQLException {
        PreparedStatement preparedStatementTeachers;
        String GET_TEACHERS = "SELECT * FROM subjects,teachers WHERE teachers.subjects=subjects.title";
        preparedStatementTeachers = connector.getConnection().prepareStatement(GET_TEACHERS);
        ResultSet resultSetTeachers = preparedStatementTeachers.executeQuery();

        while (resultSetTeachers.next()) {
            if (resultSetTeachers.getInt("day_of_the_week") != day) {
                String fullName = resultSetTeachers.getString("full_name");
                String subject = resultSetTeachers.getString("subjects");
                int numberOfPairsPerWeek = resultSetTeachers.getInt("number_of_pairs_per_week");
                int amountOfStudents = resultSetTeachers.getInt("amount_of_students");
                int dayOfTheWeek = resultSetTeachers.getInt("day_of_the_week");
                int audience = resultSetTeachers.getInt("audience");

                System.out.println("{ full name: " + fullName + " , subject: " + subject
                        + ", number of Pairs Per Week: " + numberOfPairsPerWeek + ", amount of students: " + amountOfStudents + ", day of the week: " + dayOfTheWeek + ", audience: " + audience + "}");
            }
        }
    }

    //    Вывести дни недели, в которых проводится заданное количество заня-
//    тий.
    public static void getDaysAmountOfSubjects(Connector connector, int countOfSubjects) throws SQLException {
//        PreparedStatement preparedStatementTeachers;
//        String GET_TEACHERS = "SELECT * FROM subjects,teachers WHERE teachers.subjects=subjects.title";
//        preparedStatementTeachers = connector.getConnection().prepareStatement(GET_TEACHERS);
//        ResultSet resultSetTeachers = preparedStatementTeachers.executeQuery();
//
//        int count = 0;
//        while (resultSetTeachers.next()) {
//            if (resultSetTeachers.getString("title") != null && resultSetTeachers.getInt("day_of_the_week") == resultSetTeachers.getInt("day_of_the_week")) {
//                count++;
//            }
//        }
//        System.out.println(count);
    }
}