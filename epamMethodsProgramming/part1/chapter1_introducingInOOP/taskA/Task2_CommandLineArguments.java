package epamMethodsProgramming.part1.chapter1_introducingInOOP.taskA;

import java.util.Scanner;

/**
 * Created by Alexander on 8/30/2016.
 */

/*Отобразить в окне консоли аргументы командной строки в обратном порядке.*/
public class Task2_CommandLineArguments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: " + ", enter b: " + " ,enter c: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println("C: " + c +", b: " + b + ", a: " + a);
    }
}
