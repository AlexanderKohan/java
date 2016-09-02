package epamMethodsProgramming.part1.chapter5_InnerClasses.code.teacher;

/**
 * Created by Alexander on 9/2/2016.
 */
public class TeacherLogic {
    public void excludeProcess(int rectorId, String nameStudent) {
        AbstractTeacher teacher = TeacherCreator.createTeacher(rectorId);
        System.out.println("Студент: " + nameStudent
                + " отчислен:" + teacher.excludeStudent(nameStudent));
    }
}
