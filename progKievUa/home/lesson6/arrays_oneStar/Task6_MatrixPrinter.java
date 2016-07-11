package progKievUa.homeWork.lesson6.arrays_oneStar;

/**
 * Created by Alexander on 7/7/2016.
 */

/*
Написать метод вывода матрицы в консоль. Предполагается, что матрица прямоугольная.
        void printMatrix(int[][] matrix)
*/

public class Task6_MatrixPrinter {
    public static void main(String[] args) {

        int a = 2;
        int b = 5;

        int[][] matrix = new int[a][b];

        printMatrix(a, b, matrix);
    }

    private static void printMatrix(int a, int b, int[][] matrix) {
        int k = 0;
        int i;
        int j;
        for (i = 0; i < a; i++)
            for (j = 0; j < b; j++) {
                matrix[i][j] = k;
                k++;
            }
        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
}
