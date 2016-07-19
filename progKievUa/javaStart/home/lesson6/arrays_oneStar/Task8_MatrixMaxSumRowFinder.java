package progKievUa.javaStart.home.lesson6.arrays_oneStar;

/**
 * Created by Alexander on 7/7/2016.
 */

/*
Написать метод поиска индекса строки с максимальной суммой элементов. Если таких строк несколько, вернуть индекс первой.
Предполагается, что матрица прямоугольная.
        int findMaxSumRow(int[][] matrix)

        Пример работы:
        findMaxSumRow(new int[][]{{0, 3, -2},
        {2, 1, 3},
        {-1, 5, 2}}) == 1
*/

public class Task8_MatrixMaxSumRowFinder {
    public static void main(String[] args) {

        int matrix[][] = {{0, 3, -2},
                {2, 1, 3},
                {-1, 5, 2}};

        System.out.println(findMaxSumRow(matrix));
    }

    public static int findMaxSumRow(int array[][]) {
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        for (int i = 0; i < 3; i++) {
            sum1 += array[0][i];
            sum2 += array[1][i];
            sum3 += array[2][i];
        }
        if (sum1 > sum2 && sum1 > sum3) {
            return 1;
        } else if (sum2 > sum1 && sum2 > sum3) {
            return 2;
        } else if (sum3 > sum1 && sum3 > sum2){
            return 3;
        } else {
            return 1;
        }
    }
}
