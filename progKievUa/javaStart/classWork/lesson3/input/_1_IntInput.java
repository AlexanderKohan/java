package com.bvan.javastart.input;

import java.util.Scanner;

/**
 * Created on 20.04.2015
 *
 * @author Bohdan Vanchuhov
 */
public class _1_IntInput {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter int: ");
        int x = scanner.nextInt();

        // Business Logic
        x += 10;

        // Output
        System.out.println(x);

        scanner.close();
    }
}
