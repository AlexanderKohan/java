package epamMethodsProgramming.part1.chapter3_ClassesAndObjects.taskA.task1_student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexander on 8/31/2016.
 */
public enum Faculty {
    SCIENCES("Sciences"),
    LAW("Law"),
    MANAGEMENT("Management"),
    ENGINEERING("Engineering"),
    COMMERCE("Commerce");

    private final String faculty;

    Faculty(String faculty) {
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public static List<Student> getStudentsList(List<Student> students, String faculty){
        List<Student> list = new ArrayList<>();

        for (Student student : students){
            if (student.getFaculty().equals(faculty)){
                list.add(student);
            }
        }
        return list;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "faculty='" + faculty + '\'' +
                '}';
    }
}


