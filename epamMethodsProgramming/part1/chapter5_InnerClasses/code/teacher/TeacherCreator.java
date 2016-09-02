package epamMethodsProgramming.part1.chapter5_InnerClasses.code.teacher;

/**
 * Created by Alexander on 9/2/2016.
 */
public class TeacherCreator {
    public static AbstractTeacher createTeacher(int id) {
// объявление класса внутри метода
        class Rector extends AbstractTeacher {
            Rector(int id) {
                super(id);
            }

            @Override
            public boolean excludeStudent(String name) {
                if (name != null) { // изменение статуса студента в базе данных
                    return true;
                } else {
                    return false;
                }
            }
        } // конец внутреннего класса
        if (isRectorId(id)) {
            return new Rector(id);
        } else {
            return new Teacher(id);
        }
    }

    private static boolean isRectorId(int id) {
        return id == 6; // stub
    }
}
