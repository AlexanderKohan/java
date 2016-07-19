package progKievUa.javaOOP.home.lesson1;

/**
 * Created by Alexander on 7/19/2016.
 */
public class RectangleRunner {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(15, 9);
        Rectangle rectangle2 = new Rectangle(12, 8);
        Rectangle rectangle3 = new Rectangle(10, 7);

        System.out.println(rectangle1.getArea() + rectangle2.getArea() + rectangle3.getArea());
    }
}
