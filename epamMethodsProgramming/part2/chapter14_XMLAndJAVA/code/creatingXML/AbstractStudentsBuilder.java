package epamMethodsProgramming.part2.chapter14_XMLAndJAVA.code.creatingXML;

import epamMethodsProgramming.part2.chapter14_XMLAndJAVA.code.jaxb.Student;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Alexander on 9/23/2016.
 */
public abstract class AbstractStudentsBuilder {
    // protected так как к нему часто обращаются из подкласса
    protected Set<Student> students;

    public AbstractStudentsBuilder() {
        students = new HashSet<Student>();
    }

    public AbstractStudentsBuilder(Set<Student> students) {
        this.students = students;
    }

    public Set<Student> getStudents() {
        return students;
    }

    abstract public void buildSetStudents(String fileName);
}
