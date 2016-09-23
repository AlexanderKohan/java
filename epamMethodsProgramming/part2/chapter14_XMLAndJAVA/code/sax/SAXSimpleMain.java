package epamMethodsProgramming.part2.chapter14_XMLAndJAVA.code.sax;

import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;
import org.xml.sax.SAXException;
import java.io.IOException;

/**
 * Created by Alexander on 9/23/2016.
 */

public class SAXSimpleMain {
    public static void main(String[ ] args) {
        try {
// создание SAX-анализатора
            XMLReader reader = XMLReaderFactory.createXMLReader();
            SimpleStudentHandler handler = new SimpleStudentHandler();
            reader.setContentHandler(handler);
            reader.parse("src/epamMethodsProgramming/part2/chapter14_XMLAndJAVA/students.xml");
        } catch (SAXException e) {
            System.err.print("ошибка SAX парсера " + e);
        } catch (IOException e) {
            System.err.print("ошибка I/О потока " + e);
        }
    }
}
