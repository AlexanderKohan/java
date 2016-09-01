package epamMethodsProgramming.part1.chapter4_InheritanceAndPolymorphism.taskA.Task2_Auto;

/**
 * Created by Alexander on 9/1/2016.
 */
public class Wheel {

    private String mark;
    private int diam;

    public Wheel() {
    }

    public Wheel(String mark, int diam) {
        this.mark = mark;
        this.diam = diam;
    }


    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getDiam() {
        return diam;
    }

    public void setDiam(int diam) {
        this.diam = diam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Wheel wheel = (Wheel) o;

        if (diam != wheel.diam) return false;
        return mark != null ? mark.equals(wheel.mark) : wheel.mark == null;

    }

    @Override
    public int hashCode() {
        int result = mark != null ? mark.hashCode() : 0;
        result = 31 * result + diam;
        return result;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "mark='" + mark + '\'' +
                ", diam=" + diam +
                '}';
    }
}
