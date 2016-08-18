package progKievUa.javaOOP.home.lesson5.train;

import java.util.Random;

/**
 * Created by Alexander on 8/6/2016.
 */
public class Train implements ITrain {

    public static final int MAX_LENGTH = 10000;

    private Carriage currentCarriage;
    private int length;

    public Train() {
        length = generateLength();
        initCarriage();
    }

    private int generateLength() {
        Random random = new Random();
        return 1 + random.nextInt(MAX_LENGTH);
    }

    private void initCarriage() {
        Carriage head = new Carriage();
        currentCarriage = head;

        for (int i = 1; i < length; i++) {
            Carriage newCarriage = new Carriage(currentCarriage, null);
            currentCarriage.next = newCarriage;
            currentCarriage = newCarriage;
        }

        currentCarriage.next = head;
        head.prev = currentCarriage;

        currentCarriage = head;
    }

    @Override
    public void turnLeft() {
        currentCarriage = currentCarriage.prev;
    }

    @Override
    public void turnRight() {
        currentCarriage = currentCarriage.next;
    }

    @Override
    public void lightOn() {
        currentCarriage.light = true;
    }

    @Override
    public void lightOff() {
        currentCarriage.light = false;
    }

    @Override
    public boolean isLightOn() {
        return currentCarriage.light;
    }

    @Override
    public boolean isLength(int expectedLength) {
        return length == expectedLength;
    }

    @Override
    public String toString() {
        return "TrainImpl{" +
                "currentCarriage id=" + currentCarriage.id +
                ", length=" + length +
                '}';
    }
}
