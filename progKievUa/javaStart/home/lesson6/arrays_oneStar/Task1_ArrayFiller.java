package java.progKievUa.javaStart.home.lesson6.arrays_oneStar;

import java.util.Arrays;

/**
 * Created by Alexander on 7/5/2016.
 */

/*Написать метод заполнения массива array указанным значением filler.
        void fill(int[] array, int filler)*/

public class Task1_ArrayFiller {
    public static void main(String[] args) {

        int array[] = new int[9];
        fillArray(array, 9);
        System.out.println(Arrays.toString(array));
    }

    public static int fillArray(int array[], int filler) {
        for (int i = 0; i < array.length; i++) {
            array[i] = filler;
        }
        return filler;
    }
}
