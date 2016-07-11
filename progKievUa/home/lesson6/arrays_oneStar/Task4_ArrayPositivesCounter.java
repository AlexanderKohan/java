package progKievUa.homeWork.lesson6.arrays_oneStar;

/**
 * Created by Alexander on 7/7/2016.
 */

/*
Написать метод подсчета количества положительных чисел в массиве.
        int countPositives(int[] array)

        Пример работы:
        countPositives(new int[]{-3, 0, -1, 4, -2, 5}) == 2
        countPositives(new int[]{-3, 0, -1, -4, -2, -5}) == 0
*/

public class Task4_ArrayPositivesCounter {
    public static void main(String[] args) {

        int[] array1 = new int[]{-3, 0, -1, 4, -2, 5};
        int[] array2 = new int[]{-3, 0, -1, -4, -2, -5};
        System.out.println(countPositives(array1));
        System.out.println(countPositives(array2));
    }

    public static int countPositives(int[] array) {
        int positive = 0;
        for (int i : array) {
            if (i > 0) {
                positive++;
            }
        }

        return positive;
    }
}
