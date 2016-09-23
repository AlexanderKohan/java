package epamMethodsProgramming.part2.chapter14_XMLAndJAVA.code.creatingXML;

import epamMethodsProgramming.part2.chapter14_XMLAndJAVA.code.jaxb.Student;

import javax.xml.stream.XMLInputFactory;
import java.util.Set;

/**
 * Created by Alexander on 9/23/2016.
 */
public class StudentsStAXBuilder extends AbstractStudentsBuilder {
    private XMLInputFactory inputFactory;

    public StudentsStAXBuilder() {
// more code
    }

    public StudentsStAXBuilder(Set<Student> students) {
        super(students);
// more code
    }

    @Override
    public void buildSetStudents(String fileName) {
// more code
    }
}
