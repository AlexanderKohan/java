package epamMethodsProgramming.part1.chapter4_InheritanceAndPolymorphism.taskA.Task5_Planet;

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
