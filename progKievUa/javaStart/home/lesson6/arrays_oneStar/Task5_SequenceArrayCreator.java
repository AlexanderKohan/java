package progKievUa.javaStart.home.lesson6.arrays_oneStar;

import java.util.Arrays;

/**
 * Created by Alexander on 7/7/2016.
 */

/*
Написать метод создания массива размера size, заполненного значениями от 0..(size-1). Если size < 0,
        бросить исключение IllegalArgumentException.
        int[] createSequenceArray(int size)

        Пример работы:
        createSequenceArray(5) => {0, 1, 2, 3, 4}
        createSequenceArray(-1)  IllegalArgumentException
*/

public class Task5_SequenceArrayCreator {
    public static void main(String[] args) {


        System.out.println(createSequenceArray(5));
        System.out.println(createSequenceArray(-1));

    }

    public static String createSequenceArray(int size) {
        int[] array = new int[size];

        if (size > 0) {
            for (int i = 0; i < array.length; i++) {
                array[i] = i;
            }
            return Arrays.toString(array);
        } else {
            throw new IllegalArgumentException("null");
        }
    }
}
