package methodsProgramming.part1.introducingInOOP.taskA;

import java.util.Scanner;

/**
 * Created by Alexander on 8/30/2016.
 */

/*Ввести пароль из командной строки и сравнить его со строкой-образцом.*/

public class Task4_ComparingPassword {
    public static void main(String[] args) {

        String password = "Qsx124A" ;

        System.out.print("Enter the password: ");
        Scanner scanner = new Scanner(System.in);

        String passwordUser = scanner.next();

        boolean comparingPassword = password.equals(passwordUser);

        System.out.println(comparingPassword);
    }
}
