package java.progKievUa.javaStart.classWork.lesson6;

import java.util.Scanner;

/**
 * Created by Alexander on 7/5/2016.
 */
public class MinMaxCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = scanner.nextInt();

        System.out.println("Enter b: ");
        int b = scanner.nextInt();

        int min = min(a, b);
        int max = max(a, b);

        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }

    private static int min(int a, int b) {
        int min = (a < b) ? a : b;
        return min;
    }

    private static int max(int a, int b) {
        int max = (a > b) ? a : b;
        return max;
    }
}
