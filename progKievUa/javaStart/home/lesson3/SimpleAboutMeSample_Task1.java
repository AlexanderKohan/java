package java.progKievUa.javaStart.home.lesson3;

import java.util.Scanner;

/**
 * Created by Alexander on 22.06.2016.
 */

public class SimpleAboutMeSample_Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Создание scanner

        System.out.print("Enter your name: ");
        String name = scanner.next(); // Чтение строки

        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine(); // Чтение строки

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();// Чтение int

        // Business Logic
        String personInfo = "I'm " + name + ", " + age + " years old";

        // Output
        System.out.println(personInfo);

        scanner.close();
    }
}