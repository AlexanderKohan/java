package epamMethodsProgramming.part2.chapter14_XMLAndJAVA.code;

import java.io.*;
import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.xml.sax.SAXException;

/**
 * Created by Alexander on 9/22/2016.
 */
public class ValidatorSAXXSD {
    public static void main(String[] args) {
        String language = XMLConstants.W3C_XML_SCHEMA_NS_URI;
        String filename = "src/epamMethodsProgramming/part2/chapter14_XMLAndJAVA/studentsExt.xml";
        String schemaName = "src/epamMethodsProgramming/part2/chapter14_XMLAndJAVA/students.xsd";
        SchemaFactory factory = SchemaFactory.newInstance(language);
        File schemaLocation = new File(schemaName);
        try {
// создание схемы
            Schema schema = factory.newSchema(schemaLocation);
// создание валидатора на основе схемы
            Validator validator = schema.newValidator();
// проверка документа
            Source source = new StreamSource(filename);
            validator.validate(source);

            System.out.println(filename + " is valid.");

            StudentErrorHandler sh = new StudentErrorHandler("logs/log.txt");
            validator.setErrorHandler(sh);
            validator.validate(source);
            System.out.println(filename + " validating is ended.");
        } catch (SAXException e) {
            System.err.print("validation " + filename + " is not valid because "
                    + e.getMessage());
        } catch (IOException e) {
            System.err.print(filename + " is not valid because "
                    + e.getMessage());
        }
    }
}
