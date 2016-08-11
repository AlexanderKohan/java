package progKievUa.javaOOP.home.lesson2.immutable;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by Alexander on 7/21/2016.
 */
public final class Line {
    private final Point start;
    private final Point finish;
    private final double length;

    public Line(Point start, Point finish) {
        this.start = start;
        this.finish = finish;
        this.length = Math.sqrt(Math.pow(start.getY() - start.getX(), 2) + Math.pow(finish.getY() - finish.getX(), 2));
    }

    public double getLength() {
        return new BigDecimal(length).setScale(2, RoundingMode.UP).doubleValue();
    }


    @Override
    public String toString() {
        return "Line{" +
                "start=" + start +
                ", finish=" + finish +
                ", length=" + length +
                '}';
    }
}
