package progKievUa.javaOOP.home.lesson5.train;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Alexander on 8/6/2016.
 */
public class Train implements ITrain {

    private List<Carriage> carriages = new ArrayList<>();
    private Carriage current;

    public Train() {
    }

    public List<Carriage> add(Carriage wagon) {
        carriages.add(wagon);
        return carriages;
    }

    public Carriage getCurrent() {
        return current;
    }

    public void setCurrent(Carriage current) {
        this.current = current;
    }

    public Carriage setRandomCurrentWagon() {
        Random random = new Random();
        return carriages.get(random.nextInt(carriages.size()));
    }

    @Override
    public String toString() {
        return "Train{" +
                carriages +
                ", currentWagon=" + carriages +
                '}';
    }

    @Override
    public void turnLeft() {
        if (carriages.indexOf(current) != 0) {
            current = carriages.get(carriages.indexOf(current) - 1);
        } else {
            current = carriages.get(carriages.size() - 1);
        }
    }

    @Override
    public void turnRight() {
        if (carriages.indexOf(current) != carriages.size() - 1) {
            current = carriages.get(carriages.indexOf(current) + 1);
        } else {
            current = carriages.get(0);
        }
    }

    @Override
    public void lightOn() {
        current.setLight(true);
    }

    @Override
    public void lightOff() {
        current.setLight(false);
    }

    @Override
    public boolean isLightOn() {
        return current.isLight() == true;

    }

    @Override
    public boolean isLength(int expectedLength) {
        return carriages.size() == expectedLength;
    }
}
