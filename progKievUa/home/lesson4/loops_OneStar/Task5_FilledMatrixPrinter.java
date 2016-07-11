package progKievUa.homeWork.lesson4.loops_OneStar;

/**
 * Created by Alexander on 29.06.2016.
 */
public class Task5_FilledMatrixPrinter {
    public static void main(String[] args) {

        int rows = -3;
        int cols = 10;
        int filler = -1;

        for(int i=0; i< rows; i++) {
            System.out.print(filler + " ");
            for(int j=0; j<cols; j++) {
                System.out.print(filler + " ");
            }
            System.out.println();
        }  if (rows < 0 || cols < 0) {
            throw new IllegalArgumentException();
        }
    }
}