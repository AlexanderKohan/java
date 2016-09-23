package epamMethodsProgramming.part2.chapter14_XMLAndJAVA.code.jaxb;

import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


/**
 * Created by Alexander on 9/22/2016.
 */

public class UnMarshalMain {
    public static void main(String[ ] args) {
        try {
            JAXBContext jc = JAXBContext.newInstance(Students.class);
            Unmarshaller u = jc.createUnmarshaller();
            FileReader reader = new FileReader("studs_marsh.xml");
            Students students = (Students) u.unmarshal(reader);
            System.out.println(students);
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
