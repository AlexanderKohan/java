package java.progKievUa.javaStart.home.lesson4.loops_OneStar;

/**
 * Created by Alexander on 29.06.2016.
 */
public class Task3_EvenRangePrinter {
    public static void main(String[] args) {
        int first = 1;
        int last = 9;

        if (first < last) {
            for (int i = first + 1; i <= last; i = i + 2)
                System.out.print(i + " ");
        }
    }
}
