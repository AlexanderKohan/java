package java.progKievUa.javaOOP.home.lesson3.planet;

/**
 * Created by Alexander on 8/6/2016.
 */
public class Island {

    private String name;

    public Island(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Island{" +
                "name='" + name + '\'' +
                '}';
    }
}
