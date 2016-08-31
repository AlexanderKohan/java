package epamMethodsProgramming.part1.chapter3_ClassesAndObjects.taskA.task1_student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexander on 8/31/2016.
 */
public class StudentUtils {

    static List<Student> createStudents() {
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Alex", Faculty.LAW, Course.FIRST, Group.SECOND));
        students.add(new Student(2, "Julia", Faculty.MANAGEMENT, Course.FOUR, Group.SECOND));

        return students;
    }

    public static List<Student> findFacultyAndCourse(List<Student> students, Faculty faculty, Course course) {
        List<Student> list = new ArrayList<>();

        for (Student student : students) {
            if (student.getFaculty().equals(faculty) && student.getCourse().equals(course)) {
                list.add(student);
            }
        }
        return list;
    }

    public static List<Student> findGroup(List<Student> students, Group group) {
        List<Student> list = new ArrayList<>();
        for (Student student : students) {
            if (student.getGroup().equals(group)) {
                list.add(student);
            }
        }
        return list;
    }


    public static List<Student> findFaculty(List<Student> students, Faculty faculty) {
        List<Student> list = new ArrayList<>();
        for (Student student : students) {
            if (student.getFaculty().equals(faculty)) {
                list.add(student);
            }
        }
        return list;
    }

    public static List<Student> findByYearBirthday(List<Student> students, int year) {
        List<Student> list = new ArrayList<>();

        for (Student student : students) {
            if (student.getYearBirthday() > year) {
                list.add(student);
            }
        }
        return list;
    }
}
