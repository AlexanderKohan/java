package progKievUa.javaStart.home.lesson6.arrays_oneStar;

/**
 * Created by Alexander on 7/6/2016.
 */

/*
Написать методы поиска индекса первого и последнего положительного числа. Если положительных чисел нет, вернуть -1.
        int findFirstPositive(int[] array)
        int findLastPositive(int[] array)

        Пример работы:
        findFirstPositive(new int[]{-3, 0, -1, 4, -2, 5}) == 3
        findLastPositive(new int[]{-3, 0, -1, 4, -2, 5}) == 5
        findFirstPositive(new int[]{-3, 0, -1, -4, -2, -5}) == -1
*/

public class Task3_ArrayPositiveFinder {
    public static void main(String[] args) {

        int[] array1 = new int[]{-3, 0, -1, 4, -2, 5};
        int[] array2 = new int[]{-3, 0, -1, -1, -2, -5};

        System.out.println(findFirstPositive(array1));
        System.out.println(findLastPositive(array1));
        System.out.println(findFirstPositive(array2));

    }

    public static int findFirstPositive(int[] array) {
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                a = i;
                break;
            } else {
                a = -1;
            }
        }
        return a;
    }

    public static int findLastPositive(int[] array) {
        int a = 0;
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] > 0) {
                a = i;
                break;
            }
        }
        return a;

    }
}