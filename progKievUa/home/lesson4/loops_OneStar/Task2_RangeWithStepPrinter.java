package progKievUa.homeWork.lesson4.loops_OneStar;

/**
 * Created by Alexander on 29.06.2016.
 */
public class Task2_RangeWithStepPrinter {
    public static void main(String[] args) {

        int first = 1;
        int last = 8;
        int step = 2;

        if (first < last && step > 0) {
            for (int i = first; i <= last; i = i + step)
                System.out.print(i + " ");
        } else if (first > last && step <0) {
            for (int i = first; i >= last; i = i + step)
                System.out.print(i + " ");
        }else {
            throw new IllegalArgumentException();
        }
    }
}
