package epamMethodsProgramming.part1.chapter6_InterfacesAndAnnotations.code.interfaces.action;

/**
 * Created by Alexander on 9/3/2016.
 */
public class ActionMain {
    public static void main(String[] args) {
        IShapeAction action;
        try {
            Rectangle rectShape = new Rectangle(2, 3);
            action = new RectangleAction();
            System.out.println("Square rectangle: " + action.computeSquare(rectShape));
            System.out.println("Perimeter rectangle: " + action.computePerimeter(rectShape));

            Triangle trShape = new Triangle(3, 4, 3.14159265 / 6);
            action = new TriangleAction();
            System.out.println("Square triangle: " + action.computeSquare(trShape));
            System.out.println("Perimeter triangle: " + action.computePerimeter(trShape));
            action.computePerimeter(rectShape); // ошибка времени выполнения
        } catch (IllegalArgumentException ex) {
            System.err.println("ex.getMessage()");
        }
    }
}
