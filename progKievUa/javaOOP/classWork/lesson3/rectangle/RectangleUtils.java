package progKievUa.javaOOP.classWork.lesson3.rectangle;

import java.util.List;

/**
 * @author bvanchuhov
 */
public final class RectangleUtils {

    private RectangleUtils() {}

    public static void printRectangles(List<Rectangle> rectangles) {
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
    }

    public static int areaSum(List<Rectangle> rectangles) {
        int areaSum = 0;

        for (Rectangle rectangle : rectangles) {
            areaSum += rectangle.getArea();
        }

        return areaSum;
    }
}
