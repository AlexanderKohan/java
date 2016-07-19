package progKievUa.javaStart.classWork.lesson7;

import java.util.Arrays;

/**
 * Created by Alexander on 7/7/2016.
 */
public class ArrayReverseFiller {

    public static void main(String[] args) {
        int[] array = new int[100];

        reverseSequenceFill(array);

        System.out.println(Arrays.toString(array));
    }

    public static void reverseSequenceFill(int[] array) {
        int filler = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = filler--;
        }
    }
}
