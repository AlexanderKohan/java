package epamMethodsProgramming.part2.chapter14_XMLAndJAVA.code.creatingXML;

/**
 * Created by Alexander on 9/23/2016.
 */
public class Runner {
    public static void main(String[] args) {
        StudentBuilderFactory sFactory = new StudentBuilderFactory();
        AbstractStudentsBuilder builder = sFactory.createStudentBuilder("stax");
        builder.buildSetStudents("data/students.xml");
        System.out.println(builder.getStudents());
    }
}
