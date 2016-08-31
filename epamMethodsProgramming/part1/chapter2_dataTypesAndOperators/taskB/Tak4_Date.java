package epamMethodsProgramming.part1.chapter2_dataTypesAndOperators.taskB;

import java.util.Scanner;

/**
 * Created by Alexander on 8/31/2016.
 */

/*Блинов. Глава 2. Вариант B. 4.  Ввести число от 1 до 12.
Вывести на консоль название месяца, соответствующего данному числу.
Осуществить проверку корректности ввода чисел.*/

public class Tak4_Date {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of month: ");

        int count = scanner.nextInt();

        checkMonth(count);
        getMonth(count);

        scanner.close();
    }

    private static void getMonth(int count) {
        String[] month = new String[13];
        month[1] = "January";
        month[2] = "February";
        month[3] = "March";
        month[4] = "April";
        month[5] = "May";
        month[6] = "June";
        month[7] = "July";
        month[8] = "August";
        month[9] = "September";
        month[10] = "October";
        month[11] = "November";
        month[12] = "December";

        System.out.println("Month: " + month[count]);
    }

    private static void checkMonth(int count) {
        if (count < 1 || count > 12) {
            throw new IllegalArgumentException("month from 1 to 12");
        }
    }
}
