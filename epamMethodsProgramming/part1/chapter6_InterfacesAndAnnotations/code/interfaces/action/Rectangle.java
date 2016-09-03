package epamMethodsProgramming.part1.chapter6_InterfacesAndAnnotations.code.interfaces.action;

/**
 * Created by Alexander on 9/3/2016.
 */
public class Rectangle extends AbstractShape {
    private double b;

    public Rectangle(double a, double b) {
        super(a);
        this.b = b;
    }

    public double getB() {
        return b;
    }
}
