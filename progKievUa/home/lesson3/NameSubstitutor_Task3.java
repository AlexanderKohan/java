package progKievUa.homeWork.lesson3;

import java.util.Scanner;

/**
 * Created by Alexander on 22.06.2016.
 */
public class NameSubstitutor_Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter message: ");
        String message = scanner.nextLine();

        System.out.println("Enter name: ");
        String name = scanner.next();

        System.out.println(message + " " + String.format(name));

        scanner.close();
    }
}
