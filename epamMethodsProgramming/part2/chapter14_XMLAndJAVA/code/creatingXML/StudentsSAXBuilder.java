package epamMethodsProgramming.part2.chapter14_XMLAndJAVA.code.creatingXML;

import epamMethodsProgramming.part2.chapter14_XMLAndJAVA.code.creatingXML.buildSax.StudentHandler;
import epamMethodsProgramming.part2.chapter14_XMLAndJAVA.code.jaxb.Student;
import jdk.internal.org.xml.sax.XMLReader;

import java.util.Set;

/**
 * Created by Alexander on 9/23/2016.
 */
public class StudentsSAXBuilder extends AbstractStudentsBuilder {
    private StudentHandler sh;
    private XMLReader reader;

    public StudentsSAXBuilder() {
// more code
    }

    public StudentsSAXBuilder(Set<Student> students) {
        super(students);
// more code
    }

    @Override
    public void buildSetStudents(String fileName) {
// more code
    }
}