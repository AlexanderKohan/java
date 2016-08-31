package epamMethodsProgramming.part1.chapter1_introducingInOOP.taskA;

import java.util.Scanner;

/**
 * Created by Alexander on 8/30/2016.
 */

/*Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат на консоль.*/

public class Task5_CommandLineSum {
    public static void main(String[] args) {

        System.out.println("Enter numbers: ");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = a + b;

        System.out.println("Sum: " + sum);
    }
}
