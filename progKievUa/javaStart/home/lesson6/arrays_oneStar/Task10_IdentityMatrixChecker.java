package progKievUa.javaStart.home.lesson6.arrays_oneStar;

/**
 * Created by Alexander on 7/7/2016.
 */

/*Написать метод определения, является ли матрица единичной. Исходная матрица не должна изменяться.
Предполагается, что матрица прямоугольная. Если матрица НЕ квадратная, бросить исключение IllegalArgumentException.
        https://ru.wikipedia.org/wiki/Единичная_матрица
        boolean isIdentity(int[][] matrix)

        Пример работы:
        isIdentity(new int[][]{	{1, 0, 0},
        {0, 1, 0},
        {0, 0, 1}	}) == true
        isIdentity(new int[][]{	{1, 0, 2},
        {0, 1, 0},
        {2, 0, 1}	}) == false
        isIdentity(new int[][]{	{1, 0, 0},
        {0, 1, 0},
        {0, 0, 1},
        {0, 0, 0}	})  IllegalArgumentException*/

public class Task10_IdentityMatrixChecker {
    public static void main(String[] args) {
        int[][] matrix = {{1, 0, 0},
                {0, 1, 0},
                {0, 0, 1},
                {0, 0, 0}};

        boolean isIden = isIdentity(matrix);

        System.out.println(isIden);
    }

    public static boolean isIdentity(int matrix[][]) {

        boolean isIden = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix.length != matrix[i].length) {
                    throw new IllegalAccessError();
                }
                if ((i == j) && (matrix[i][j] == 1) || (i != j) && (matrix[i][j] == 0)) {
                    isIden = true;
                    break;
                } else {
                    isIden = false;
                    break;
                }
            }
            if (isIden == false) {
                break;
            }
        }

        return isIden;
    }
}
