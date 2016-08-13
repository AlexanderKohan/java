package java.progKievUa.javaStart.home.lesson4.loops_OneStar;

/**
 * Created by Alexander on 29.06.2016.
 */
public class Task1_RangePrinter {
    public static void main(String[] args) {
        int first = 5;
        int last = 1;

        if (first < last) {
            for (int i = first; i <= last; i++)
                System.out.print(i + " ");
        } else {
            for (int i = first; i >= last; i--)
                System.out.print(i + " ");
        }
        System.out.println();
    }
}
