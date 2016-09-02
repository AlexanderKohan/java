package epamMethodsProgramming.part1.chapter5_InnerClasses.code.teacher;

/**
 * Created by Alexander on 9/2/2016.
 */

public class Teacher extends AbstractTeacher {

    public Teacher(int id) {
        super(id);
    }

    @Override
    public boolean excludeStudent(String name) {
        return false;
    }
}
