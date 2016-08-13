package java.progKievUa.javaStart.home.lesson2;

/**
 * Created by Alexander on 17.06.2016.
 */

public class DateCalculator {

    public static void main(String[] args) {
        int days = 62; // Any positive number

        int year = (360 + days)/360;
        int month = ((days%360)/30) + 1;
        int day = days % 30;

        System.out.println("year = " + year);
        System.out.println("month = " + month);
        System.out.println("day = " + day);
    }
}