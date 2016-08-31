package epamMethodsProgramming.part1.chapter3_ClassesAndObjects.taskA.task1_student;

/**
 * Created by Alexander on 8/31/2016.
 */
public enum Course {
    FIRST("First"),
    SECOND("Second"),
    THIRD("Five"),
    FOUR("Four"),
    FIVE("Five");

    private final String course;

    Course(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Course{" +
                "course='" + course + '\'' +
                '}';
    }
}
