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

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getPerimeter() {
        return 2 * (width + height);
    }

    public int getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
