package progKievUa.homeWork.lesson6.arrays_oneStar;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by Alexander on 7/7/2016.
 */

/*
Написать метод подсчета среднего арифметического всех элементов матрицы. Предполагается, что матрица прямоугольная.
        double calculateAverage(int[][] matrix)

        Пример работы:
        findMaxSumRow(new int[][]{
        {0, 3, -2},
        {2, 1, 3},
        {-1, 5, 2}}) == 1.4444…
*/

public class Task7_MatrixAverageCalculator {
    public static void main(String[] args) {

        int matrix[][] = {
                {0, 3, -2},
                {2, 1, 3},
                {-1, 5, 2}};

        System.out.println(averageMatrix(matrix));
    }

    private static double averageMatrix(int[][] matrix) {
        double sumArr = 0;
        int count = 0;
        double sum;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sumArr += matrix[i][j];
                count += 1;
            }
        }
        sum = sumArr / count;
        return sum;
    }
}