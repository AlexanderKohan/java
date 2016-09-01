package epamMethodsProgramming.part1.chapter4_InheritanceAndPolymorphism.taskA.Task5_Planet;

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
