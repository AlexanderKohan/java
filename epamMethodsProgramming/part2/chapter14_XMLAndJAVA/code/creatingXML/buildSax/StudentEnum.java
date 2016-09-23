package epamMethodsProgramming.part2.chapter14_XMLAndJAVA.code.creatingXML.buildSax;

/**
 * Created by Alexander on 9/23/2016.
 */
public enum StudentEnum {
    STUDENTS("students"),
    LOGIN("login"),
    FACULTY("faculty"),
    STUDENT("student"),
    NAME("name"),
    TELEPHONE("telephone"),
    COUNTRY("country"),
    CITY("city"),
    STREET("street"),
    ADDRESS("address");
    private String value;

    private StudentEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
