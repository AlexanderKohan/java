package progKievUa.homeWork.lesson2;

/**
 * Created by Alexander on 17.06.2016.
 */

public class DigitsPrinter {

    public static void main(String[] args) {
        int n = 987654321;  // Any positive number
        // Your code. Print first 5 digits of the number
            System.out.println(n / 10000 % 10);
            System.out.println(n / 1000 % 10);
            System.out.println(n / 100 % 10);
            System.out.println(n / 10 % 10);
            System.out.println(n % 10);
        }
}
