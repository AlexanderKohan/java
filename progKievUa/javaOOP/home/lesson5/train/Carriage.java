package java.progKievUa.javaOOP.home.lesson5.train;

/**
 * Created by Alexander on 8/6/2016.
 */
public class Carriage {

    private static int nextId = 0;
    private int id = nextId++;
    private boolean light;

    public Carriage(boolean light) {
        this.light = light;
    }

    public int getId() {
        return id;
    }

    public boolean isLight() {
        return light;
    }

    public void setLight(boolean light) {
        this.light = light;
    }

    @Override
    public String toString() {
        return "Wagon{" +
                "id=" + id +
                ", light=" + light +
                '}';
    }
}
