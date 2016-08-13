package java.progKievUa.javaStart.classWork.lesson6;

/**
 * Created by Alexander on 7/6/2016.
 */
public class RangePrinter {

    public static void main(String[] args) {
        printAscRange(10, 20);
        printAscRange(1, 5);

        printDescRange(100, 90);
    }

    private static void printRange(int first, int last) {
        if (first < last) {
            printAscRange(first, last);
        } else {
            printDescRange(first, last);
        }
    }

    private static void printDescRange(int first, int last) {
        for (int i = first; i >= last; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void printAscRange(int first, int last) {
        for (int i = first; i <= last; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
