package java.progKievUa.javaStart.classWork.lesson7;

import java.util.Arrays;

/**
 * Created by Alexander on 7/7/2016.
 */
public class ArraySeqFiller {

    public static void main(String[] args) {
        int[] array = new int[100];

        sequenceFill(array);

        System.out.println(Arrays.toString(array));
    }

    public static void sequenceFill(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }
}
