package progKievUa.javaOOP.home.lesson5.train;

import java.util.Random;

/**
 * Created by Alexander on 8/6/2016.
 */
public class Carriage {

    private static Random lightGenerator = new Random();
    private static int nextId = 0;

    int id = nextId++;
    boolean light;
    Carriage next;
    Carriage prev;

    public Carriage(Carriage prev, Carriage next, boolean light) {
        this.prev = prev;
        this.next = next;
        this.light = light;
    }

    public Carriage(Carriage prev, Carriage next) {
        this(prev, next, lightGenerator.nextBoolean());
    }

    public Carriage() {
        this(null, null);
    }

    @Override
    public String toString() {
        return "Carriage{" +
                "id=" + id +
                ", light=" + light +
                ", next id=" + next.id +
                ", prev id=" + prev.id +
                '}';
    }
}
