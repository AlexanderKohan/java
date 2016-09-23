package epamMethodsProgramming.part2.chapter14_XMLAndJAVA.code.creatingXML.domJAXP;

/**
 * Created by Alexander on 9/23/2016.
 */
public class Runner {
    public static void main(String[] args) {
        StudentsDOMBuilder domBuilder = new StudentsDOMBuilder();
        domBuilder.buildSetStudents("src/epamMethodsProgramming/part2/chapter14_XMLAndJAVA/students.xml");
        System.out.println(domBuilder.getStudents());
    }
}
