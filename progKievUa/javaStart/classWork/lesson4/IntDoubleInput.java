package com.bvan.teaching.javastart.groups.group27.lesson4;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class IntDoubleInput {

    public static void main(String[] args) {
        System.out.println(Locale.getDefault());

        // Input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scanner.nextInt();

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        // BL
        double result = a + b;

        // Output
        System.out.println(result);
    }
}
