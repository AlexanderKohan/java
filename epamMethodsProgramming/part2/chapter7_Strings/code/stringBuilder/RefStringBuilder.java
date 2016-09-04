package epamMethodsProgramming.part2.chapter7_Strings.code.stringBuilder;

/**
 * Created by Alexander on 9/3/2016.
 */
public class RefStringBuilder {
    public static void changeStr(StringBuilder s) {
        s.append(" Certified");
    }
    public static void main(String[ ] args) {
        StringBuilder str = new StringBuilder("Oracle");
        changeStr(str);
        System.out.println(str);
    }
}
