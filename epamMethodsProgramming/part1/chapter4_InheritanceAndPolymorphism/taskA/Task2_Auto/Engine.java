package epamMethodsProgramming.part1.chapter4_InheritanceAndPolymorphism.taskA.Task2_Auto;

/**
 * Created by Alexander on 9/1/2016.
 */
public class Engine {

    private String mark;

    public Engine() {
    }

    public Engine(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Engine engine = (Engine) o;

        return mark != null ? mark.equals(engine.mark) : engine.mark == null;

    }

    @Override
    public int hashCode() {
        return mark != null ? mark.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "mark=" + mark +
                '}';
    }
}
