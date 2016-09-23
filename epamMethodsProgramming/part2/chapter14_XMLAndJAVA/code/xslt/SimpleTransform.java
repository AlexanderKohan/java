package epamMethodsProgramming.part2.chapter14_XMLAndJAVA.code.xslt;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

/**
 * Created by Alexander on 9/23/2016.
 */
public class SimpleTransform {
    public static void main(String[ ] args) {
        try {
            TransformerFactory tf = TransformerFactory.newInstance();
// установка используемого XSL-преобразования
            Transformer transformer = tf.newTransformer(new StreamSource("src/epamMethodsProgramming/part2/chapter14_XMLAndJAVA/xslt/students.xsl"));
// установка исходного XML-документа и конечного XML-файла
            transformer.transform(new StreamSource("src/epamMethodsProgramming/part2/chapter14_XMLAndJAVA/xslt/students.xml"),
                    new StreamResult("newstudents.xml"));
            System.out.println("Transform " + transformer + " complete");
        } catch(TransformerException e) {
            System.err.println("Impossible transform file: " + e);
        }
    }
}
