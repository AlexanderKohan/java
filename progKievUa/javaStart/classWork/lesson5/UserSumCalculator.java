package com.bvan.teaching.javastart.groups.group27.lesson5;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class UserSumCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        int n;
        do {
            System.out.print(">> ");
            n = scanner.nextInt();

            sum += n;
        } while (n != 0);

        System.out.println("sum = " + sum);
    }
}
