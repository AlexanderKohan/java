package progKievUa.javaStart.classWork.lesson3;

import java.util.Scanner;

public class ScannerPersonInfoSample {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in); // Создание scanner

        System.out.print("Enter name: ");
        String name = scanner.next(); // Чтение строки

        System.out.print("Enter age: ");
        int age = scanner.nextInt();// Чтение int

        // Business Logic
        String personInfo = "Hello, I'm " + name + ", " + age + " years old";

        // Output
        System.out.println(personInfo);
    }
}