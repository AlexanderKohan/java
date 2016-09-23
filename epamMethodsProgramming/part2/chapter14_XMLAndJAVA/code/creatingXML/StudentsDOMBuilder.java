package epamMethodsProgramming.part2.chapter14_XMLAndJAVA.code.creatingXML;

import epamMethodsProgramming.part2.chapter14_XMLAndJAVA.code.jaxb.Student;

import javax.xml.parsers.DocumentBuilder;
import java.util.Set;

/**
 * Created by Alexander on 9/23/2016.
 */
public class StudentsDOMBuilder extends AbstractStudentsBuilder {
    private DocumentBuilder docBuilder;

    public StudentsDOMBuilder() {
// more code
    }

    public StudentsDOMBuilder(Set<Student> students) {
        super(students);
// more code
    }

    @Override
    public void buildSetStudents(String fileName) {
// more code
    }
}
