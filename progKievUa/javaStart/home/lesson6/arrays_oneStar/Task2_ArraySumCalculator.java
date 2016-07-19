package progKievUa.javaStart.home.lesson6.arrays_oneStar;

/**
 * Created by Alexander on 7/6/2016.
 */

/*Написать метод вычисления суммы всех элементов массива.
        int sum(int[] array)
        Пример работы:
        sum(new int[]{2, 1, 3}) == 6
*/

public class Task2_ArraySumCalculator {
    public static void main(String[] args) {


        int mass[] = {2, 1, 3};
        int sum = 0;

        sum = getSumArray(mass, sum);
        System.out.print(sum);

        System.out.println();
    }

    public static int getSumArray(int array[], int sum) {
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }
}