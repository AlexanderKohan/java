package progKievUa.javaStart.home.lesson4;

import java.util.Scanner;

/**
 * Created by Alexander on 29.06.2016.
 *
 * Вывести все числа от from до to. from, to - любые.
 */
public class Loop_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first variable: ");
        int a = scanner.nextInt();

        System.out.println("Enter second variable: ");
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++){
            System.out.println(i);
        }
    }
}
