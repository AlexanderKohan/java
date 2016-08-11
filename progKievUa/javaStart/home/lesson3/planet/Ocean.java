package progKievUa.javaOOP.home.lesson3.planet;

/**
 * Created by Alexander on 8/6/2016.
 */
public class Ocean {

    private String name;

    public Ocean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Ocean{" +
                "name='" + name + '\'' +
                '}';
    }
}
