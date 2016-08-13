package java.progKievUa.javaStart.home.lesson3;

import java.util.Scanner;

/**
 * Created by Alexander on 22.06.2016.
 */
public class AverageCalculator_Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = scanner.nextInt();

        System.out.println("Enter b: ");
        int b = scanner.nextInt();

        System.out.println((a / 2) + (b / 2) + (a % 2) + (b % 2) / 2);

        scanner.close();
    }

}
