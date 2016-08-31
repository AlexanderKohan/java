package epamMethodsProgramming.part1.chapter3_ClassesAndObjects.taskA.task1_student;

import java.util.List;

/**
 * Created by Alexander on 8/31/2016.
 */
public class StudentRunner {
    public static void main(String[] args) {
        List<Student> students = StudentUtils.createStudents();

        System.out.println(StudentUtils.findFaculty(students, Faculty.LAW));
        System.out.println(StudentUtils.findGroup(students, Group.SECOND));
        System.out.println(StudentUtils.findByYearBirthday(students, 2012));
        System.out.println(StudentUtils.findFacultyAndCourse(students, Faculty.MANAGEMENT, Course.SECOND));
    }
}
