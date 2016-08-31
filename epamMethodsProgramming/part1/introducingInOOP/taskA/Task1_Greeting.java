package methodsProgramming.part1.introducingInOOP.taskA;

import java.util.Scanner;

/**
 * Created by Alexander on 8/30/2016.
 */

/*Приветствовать любого пользователя при вводе его имени через командную строку.*/

public class Task1_Greeting {
    public static void main(String[] args) {

        System.out.print("Enter your name: ");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();

        System.out.println("Hello: " + name);
    }
}
