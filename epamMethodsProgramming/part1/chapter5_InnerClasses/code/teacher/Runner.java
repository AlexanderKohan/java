package epamMethodsProgramming.part1.chapter5_InnerClasses.code.teacher;

/**
 * Created by Alexander on 9/2/2016.
 */
public class Runner {
    public static void main(String[] args) {
        TeacherLogic tl = new TeacherLogic();
        tl.excludeProcess(777, "Олейников");
        tl.excludeProcess(6, "Олейников");
    }
}
