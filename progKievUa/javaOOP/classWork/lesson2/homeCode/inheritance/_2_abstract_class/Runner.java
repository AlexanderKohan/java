package progKievUa.javaOOP.classWork.lesson2.homeCode.inheritance._2_abstract_class;

import progKievUa.javaOOP.classWork.lesson2.homeCode.inheritance._2_abstract_class.shape.Shape;
import progKievUa.javaOOP.classWork.lesson2.homeCode.inheritance._2_abstract_class.shape.Rectangle;
import progKievUa.javaOOP.classWork.lesson2.homeCode.inheritance._2_abstract_class.shape.Circle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 02.06.2015
 *
 * @author Bohdan Vanchuhov
 */
public class Runner {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(0, 0, 10, 10));
        shapes.add(new Circle(0, 0, 10));

        drawShapes(shapes);
        System.out.println();

        printAreas(shapes);
    }

    private static void drawShapes(List<Shape> shapes) {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }

    private static void printAreas(List<Shape> shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
        }
    }
}
