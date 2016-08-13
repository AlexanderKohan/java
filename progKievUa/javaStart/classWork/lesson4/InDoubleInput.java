package java.progKievUa.javaStart.classWork.lesson4;

import java.util.Scanner;

/**
 * Created by Alexander on 23.06.2016.
 */
public class InDoubleInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter int: ");
        int a = scanner.nextInt();

        System.out.println("Enter double: ");
        double b = scanner.nextDouble();

        double result = a + b ;
        
        System.out.println(result);

        scanner.close();
    }
}
