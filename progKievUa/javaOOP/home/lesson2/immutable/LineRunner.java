package java.progKievUa.javaOOP.home.lesson2.immutable;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexander on 7/30/2016.
 */
public class LineRunner {
    public static void main(String[] args) {
        Point point1 = new Point(2, 4);
        Point point2 = new Point(4, 1);
        Point point3 = new Point(3, 5);

        Line line1 = new Line(point1, point2);
        Line line2 = new Line(point2, point3);
        Line line3 = new Line(point3, point1);

        ArrayList<Line> lines = new ArrayList<>();
        lines.add(line1);
        lines.add(line2);
        lines.add(line3);

        double sumOfLenght = getSum(lines);

        double longestLine = maxLine(lines);

        System.out.println("1. The sum " + sumOfLenght);
        System.out.println("2. Max length: " + longestLine);


    }

    private static double getSum(List<Line> list) {
        double sum = 0;
        for (Line l : list) {
            sum += l.getLength();
        }
        return new BigDecimal(sum).setScale(2, RoundingMode.UP).doubleValue();
    }

    public static double maxLine(List<Line> lines) {
        double max = lines.get(0).getLength();
        for (Line line : lines) {
            if (max < line.getLength()) {
                max = line.getLength();
            }
        }
        return max;
    }
}
