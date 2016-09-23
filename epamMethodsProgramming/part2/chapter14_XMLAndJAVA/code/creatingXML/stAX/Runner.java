package epamMethodsProgramming.part2.chapter14_XMLAndJAVA.code.creatingXML.stAX;

/**
 * Created by Alexander on 9/23/2016.
 */
public class Runner {
    public static void main(String[] args) {
        StudentsStAXBuilder staxBuilder = new StudentsStAXBuilder();
        staxBuilder.buildSetStudents("src/epamMethodsProgramming/part2/chapter14_XMLAndJAVA/students.xml");
        System.out.println(staxBuilder.getStudents());
    }
}
