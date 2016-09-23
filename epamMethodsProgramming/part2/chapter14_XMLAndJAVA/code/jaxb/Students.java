package epamMethodsProgramming.part2.chapter14_XMLAndJAVA.code.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

/**
 * Created by Alexander on 9/22/2016.
 */

@XmlRootElement
public class Students {
    @XmlElement(name = "student")
    private ArrayList<Student> list = new ArrayList<Student>();

    public Students() {
        super();
    }

    public void setList(ArrayList<Student> list) {
        this.list = list;
    }

    public boolean add(Student st) {
        return list.add(st);
    }

    @Override
    public String toString() {
        return "Students [list=" + list + "]";
    }
}
