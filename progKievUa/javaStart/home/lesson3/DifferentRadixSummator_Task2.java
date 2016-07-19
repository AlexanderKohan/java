package progKievUa.javaStart.home.lesson3;

import java.util.Scanner;

/**
 * Created by Alexander on 22.06.2016.
 */
public class DifferentRadixSummator_Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter X in Bin: ");
        int x = scanner.nextInt(2);

        System.out.print("Enter Y in Oct: ");
        int y = scanner.nextInt(8);

        System.out.print("Enter Z in Hex: ");
        int z = scanner.nextInt(16);

        System.out.println("X + Y + Z = " + (int)(x + y + z));

        scanner.close();
    }
}
