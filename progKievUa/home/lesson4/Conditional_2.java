package progKievUa.homeWork.lesson4;

/**
 * Created by Alexander on 28.06.2016.
 *
 *  Даны числа int a, b, c. Найти min.
 */
public class Conditional_2 {
    public static void main(String[] args) {

        int a = 8;
        int b = 2;
        int c = 2;

        if (a <= b && a <= c )
            System.out.println("Min: " + a);
        else if (b <= a && b <= c)
            System.out.println("Min: " + b);
        else if (c <= a && c <= b)
            System.out.println("Min: " + c);
    }
}
