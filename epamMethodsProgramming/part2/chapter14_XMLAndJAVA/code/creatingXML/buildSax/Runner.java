package epamMethodsProgramming.part2.chapter14_XMLAndJAVA.code.creatingXML.buildSax;

/**
 * Created by Alexander on 9/23/2016.
 */
public class Runner {
    public static void main(String[] args) {
        StudentsSAXBuilder saxBuilder = new StudentsSAXBuilder();
        saxBuilder.buildSetStudents("src/epamMethodsProgramming/part2/chapter14_XMLAndJAVA/students.xml");
        System.out.println(saxBuilder.getStudents());
    }
}
