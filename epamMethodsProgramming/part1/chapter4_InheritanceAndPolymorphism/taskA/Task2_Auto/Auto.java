package epamMethodsProgramming.part1.chapter4_InheritanceAndPolymorphism.taskA.Task2_Auto;

/**
 * Created by Alexander on 9/1/2016.
 */
public class Auto {

    String mark;
    String model;

    public Auto(String mark, String model) {
        this.mark = mark;
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void move() {
        System.out.println("Go!");
    }

    public void refuel(){
        System.out.println("Refueled!");
    }

    public void changeWheel(){
        System.out.println("Wheel is changed!");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Auto auto = (Auto) o;

        if (mark != null ? !mark.equals(auto.mark) : auto.mark != null) return false;
        return model != null ? model.equals(auto.model) : auto.model == null;

    }

    @Override
    public int hashCode() {
        int result = mark != null ? mark.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
