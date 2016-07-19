package progKievUa.javaStart.home.lesson2;

/**
 * Created by Alexander on 17.06.2016.
 */

public class AverageCalculator {

    public static void main(String[] args) {
        int a = 857;
        int b = 423;

        int avg = a / 2 + b / 2 + (a % 2 + b % 2) / 2;
        System.out.println(avg);
    }
}