package progKievUa.javaOOP.home.lesson3.planet;

/**
 * Created by Alexander on 8/6/2016.
 */
public class Mainland {

    private String name;

    public Mainland(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Mainland{" +
                "name='" + name + '\'' +
                '}';
    }
}
