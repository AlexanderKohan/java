package progKievUa.javaOOP.classWork.lesson12.multithreading.multithreading;

import java.util.Scanner;

/**
 * @author Bohdan Vanchuhov
 */
public final class ConcurrencyUtils {
    private ConcurrencyUtils() {}

    public static void wainInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input something: ");
        scanner.nextLine();
    }

    public static void wainInput(String message) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input something (" + message + "): ");
        scanner.nextLine();
    }

    public static void sillyWork(long milliseconds) {
        double d = 0;

        // Experimental formula
        long iterations = 20_000 * milliseconds;
        for (long i = 0; i < iterations; i++) {
            d = Math.sin(d);
        }
    }

    public static void sleep(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
