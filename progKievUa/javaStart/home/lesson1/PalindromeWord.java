package progKievUa.javaOOP.home.lesson1;

import java.util.Scanner;

/**
 * Created by Alexander on 7/16/2016.
 */

/*Ввести N чисел с консоли. Среди чисел найти число-палиндром. Если таких чисел больше одного,  найти второе.*/

public class PalindromeWord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numbers: ");
        int palindrome = scanner.nextInt();

        isPalindrome(palindrome);
    }

    private static void isPalindrome(int palindrome) {
        String p = Integer.toString(palindrome);
        String x[] = p.split("");

        if (!(x.length == 1) && x[0].equals(x[x.length - 1])) {
            System.out.println("The number " + p + " is Palindrome");
        } else {
            System.out.println("The number " + p + " is not palindrome");
        }
    }
}
