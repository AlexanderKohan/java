package progKievUa.homeWork.lesson3;

import java.util.Scanner;

/**
 * Created by Alexander on 22.06.2016.
 */
public class SimpleFunctionCalculator_Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x: ");
        double x = scanner.nextDouble();

        double y =Math.log(Math.sin(x)+Math.pow(Math.E,x)*Math.sqrt(x)/Math.PI);
        System.out.println("f(x): "+y);

        System.out.println();

        scanner.close();
    }
}
