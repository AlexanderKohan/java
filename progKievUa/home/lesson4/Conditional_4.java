package progKievUa.homeWork.lesson4;

/**
 * Created by Alexander on 28.06.2016.
 *
 * Даны числа int a, b, c. Вывести их в порядке возрастания.
 */
public class Conditional_4 {
    public static void main(String[] args) {
        int a = 2;
        int b = 8;
        int c = 7;

        if (a < b)
            if (b < c)
                System.out.println(a + " " + b + " " + c);
        else if (a < c)
                System.out.println(a + " " + c + " " + b);
        if (b < c)
            if (c < a)
                System.out.println(b + " " + c + " " + a);
        else if (b < a)
                System.out.println(b + " " + a + " " + c);
        if (c < a)
            if (a < b)
                System.out.println(c + " " + a + " " + b);
        else if (c < b)
                System.out.println(c + " " + b + " " + a);
    }
}
