package java.progKievUa.javaOOP.home.lesson5.train;

/**
 * Created by Alexander on 8/6/2016.
 */
public interface ITrain {
    void turnLeft();
    void turnRight();
    void lightOn();
    void lightOff();
    boolean isLightOn();

    boolean isLength(int expectedLength);
}
