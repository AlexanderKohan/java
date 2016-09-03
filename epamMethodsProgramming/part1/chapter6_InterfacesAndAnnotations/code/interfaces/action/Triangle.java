package epamMethodsProgramming.part1.chapter6_InterfacesAndAnnotations.code.interfaces.action;

/**
 * Created by Alexander on 9/3/2016.
 */
public class Triangle extends AbstractShape {
    private double b;
    private double angle;

    public Triangle(double a, double b, double angle) {
        super(a);
        this.b = b;
        this.angle = angle;
    }

    public double getAngle() {
        return angle;
    }

    public double getB() {
        return b;
    }

//    public double getC(){
//        return c;
//    }


}
