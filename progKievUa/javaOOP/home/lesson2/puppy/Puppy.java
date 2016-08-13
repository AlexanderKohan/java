package java.progKievUa.javaOOP.home.lesson2.puppy;

/**
 * Created by Alexander on 7/21/2016.
 */
public class Puppy extends Dog {
    private String name;

    public Puppy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Puppy{" +
                "name='" + name + '\'' +
                '}';
    }
}
