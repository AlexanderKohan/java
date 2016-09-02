package epamMethodsProgramming.part1.chapter5_InnerClasses.code.teacher;

/**
 * Created by Alexander on 9/2/2016.
 */
public abstract class AbstractTeacher {
    private int id;

    public AbstractTeacher(int id) {
        this.id = id;
    }

    public abstract boolean excludeStudent(String name);
}
