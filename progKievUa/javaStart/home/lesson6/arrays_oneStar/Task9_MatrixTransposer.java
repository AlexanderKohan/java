package progKievUa.javaStart.home.lesson6.arrays_oneStar;

/**
 * Created by Alexander on 7/7/2016.
 */

/*
Написать метод транспонирования матрицы. Исходная матрица не должна изменяться. Предполагается, что матрица прямоугольная.
        https://ru.wikipedia.org/wiki/Транспонированная_матрица
        int[][] transpose(int[][] sourceMatrix)

        Пример работы:
        transpose(new int[][]{	{1, 2, 3, 4},
        {5, 6, 7, 8}		}) => {	{1, 5},
        {2, 6},
        {3, 7},
        {4, 8}		}
*/

public class Task9_MatrixTransposer {
    public static void main(String[] args) {

        int matrix[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8}};

        transport(matrix);
    }

    public static void transport(int array[][]) {

        int col = 2;
        int line = 4;

        int tMatrix[][] = new int[line][col];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                col = i;
                line = j;
                tMatrix[line][col] = array[i][j];
            }
        }
        for (line = 0; line < tMatrix.length; line++) {
            for (col = 0; col < tMatrix[line].length; col++) {
                System.out.print(tMatrix[line][col] + " ");
            }
            System.out.println();
        }
    }
}
