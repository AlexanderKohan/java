package java.progKievUa.javaStart.classWork.lesson7;

import java.util.Arrays;

/**
 * Created by Alexander on 7/7/2016.
 */
public class ArrayFiller {
    public static void main(String[] args) {

        int array[] = new int[10];
        fill(array, 100);

        System.out.println(Arrays.toString(array));
    }

    public static void fill(int[] array, int filler) {

        for (int i = 0; i < array.length; i++) {
            array[i] = filler;
        }
    }
}