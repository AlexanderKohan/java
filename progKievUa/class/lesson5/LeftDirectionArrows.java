package progKievUa.classWork.lesson5;

/**
 * Created by Alexander on 05.07.2016.
 */
public class LeftDirectionArrows {

    public static final int ARROWS_QUANTITY = 2;
    public static final int ARROW_SIZE = 5;

    public static void main(String[] args) {
        printLeftDirectionArrows(ARROW_SIZE, ARROWS_QUANTITY);
    }

    private static void printLeftDirectionArrows(int arrowSize, int arrowsQuantity) {
        for (int blacksInRow = 1; blacksInRow <= arrowSize; blacksInRow++) {
            printArrowsRow(blacksInRow, arrowSize, arrowsQuantity);
        }
        for (int blacksInRow = arrowSize - 1; blacksInRow >= 1; blacksInRow--) {
            printArrowsRow(blacksInRow, arrowSize, arrowsQuantity);
        }
    }

    private static void printArrowsRow(int blacksInRow, int arrowSize, int arrowsQuantity) {
        for (int arrowIndex = 0; arrowIndex < arrowsQuantity; arrowIndex++) {
            printArrowRow(blacksInRow, arrowSize);
        }
        System.out.println();
    }

    private static void printArrowRow(int blacksInRow, int arrowSize) {
        int whitesInRow = arrowSize - blacksInRow;
        for (int i = 0; i < whitesInRow; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < blacksInRow; i++) {
            System.out.print("*");
        }
        System.out.print("|");
    }
}