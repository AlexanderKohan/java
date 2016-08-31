package epamMethodsProgramming.part1.chapter3_ClassesAndObjects.taskA.task1_student;

/**
 * Created by Alexander on 8/31/2016.
 */
public enum Group {
    FIRST(123),
    SECOND(154),
    THIRD(352),
    FOUR(372);

    private final int group;

    Group(int group) {
        this.group = group;
    }

    public int getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Group{" +
                "group=" + group +
                '}';
    }
}
