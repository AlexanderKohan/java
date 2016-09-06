package epamMethodsProgramming.part2.chapter9_IOStreams.code.serealization;

import java.io.Serializable;

/**
 * Created by Alexander on 9/4/2016.
 */
public class Student implements Serializable {
    protected static String faculty;
    private String name;
    private int id;
    private transient String password;

    private static final long serialVersionUID = 1L;

    /* смысл поля serialVersionUID для класса будет объяснен ниже */
    public Student(String nameOfFaculty, String name, int id, String password) {
        faculty = nameOfFaculty;
        this.name = name;
        this.id = id;
        this.password = password;
    }
    public String toString() {
        return "\nfaculty " + faculty + "\nname " + name + "\nID " + id + "\npassword " + password;
    }
}
