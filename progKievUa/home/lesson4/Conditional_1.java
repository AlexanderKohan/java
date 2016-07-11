package progKievUa.homeWork.lesson4;

/**
 * Created by Alexander on 28.06.2016.
 *
 * Даны числа int a, b. Найти min.
 */
public class Conditional_1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;

        if (a < b && a != b)
            System.out.println("Min : " + a);
        else if (b < a && b != a)
            System.out.println("Min : " + b);
        else
            System.out.println("Variable a is equally variable b");
    }
}
