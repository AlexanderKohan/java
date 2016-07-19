package progKievUa.javaStart.home.lesson4;

/**
 * Created by Alexander on 28.06.2016.
 *
 * Даны числа int a, b, c, d. Найти min.
 */
public class Conditional_3 {
    public static void main(String[] args) {

        int a = 8;
        int b = 4;
        int c = 2;
        int d = 2;

        if (a <= b && a <= c )
            System.out.println("Min: " + a);
        else if (b <= a && b <= c && b < d)
            System.out.println("Min: " + b);
        else if (c <= a && c <= b && c <= d)
            System.out.println("Min: " + c);
        else if (d <= a && d <= b && d <= c)
            System.out.println("Min: " + d);
    }
}