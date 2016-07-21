package progKievUa.javaOOP.home.lesson1.rectangle;

/**
 * Created by Alexander on 7/19/2016.
 */

/*
Написать класс Rectangle (Прямоугольник), содержащий размеры (высоту и ширину), и умеющий подсчитывать свои периметр
и площадь.
Написать клиентский класс RectangleRunner, создающий список прямоугольников и подсчитывающий их суммарную площадь.
*/
public class Rectangle {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getPerimeter() {
        int perimeter = 2 * (width + height);
        return perimeter;
    }

    public int getArea() {
        int area;
        area = width * height;
        return area;
    }
}
