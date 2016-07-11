package progKievUa.classWork.lesson5;

/**
 * Created by Alexander on 05.07.2016.
 */

import java.util.Scanner;

/**
 * Консольное приложение.<br/>
 * Программа предлагает пользователю ввести числа. Признак окончания ввода - введеное значение 0.
 * После этого программа подсчитывает сумму введеных чисел.<br/>
 * Пример:<br/>
 * Input:<br/>
 * >> 10<br/>
 * >> 20<br/>
 * >> 50<br/>
 * >> 0<br/>
 * <br/>
 * Output:<br/>
 * sum = 80<br/>
 *
 */
public class SumCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        int n = readInt(scanner);
        while (n != 0) {
            sum += n;

            n = readInt(scanner);
        }

        System.out.println("sum = " + sum);
    }

    /**
     * Читает число типа int. Если введенное значение нельзя преобразовать к типу int, запрашивается повторный ввод.
     */
    private static int readInt(Scanner scanner) {
        System.out.print(">> ");

        while (!scanner.hasNextInt()) {
            scanner.next(); // idle reading

            System.out.println("Incorrect input. Try again");
            System.out.print(">> ");
        }

        return scanner.nextInt();
    }
}