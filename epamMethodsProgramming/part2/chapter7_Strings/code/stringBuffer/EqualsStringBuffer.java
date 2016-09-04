package epamMethodsProgramming.part2.chapter7_Strings.code.stringBuffer;

/**
 * Created by Alexander on 9/3/2016.
 */
public class EqualsStringBuffer {
    public static void main(String[ ] args) {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer(48);
        sb1.append("Java");
        sb2.append("Java");
        System.out.println(sb1.equals(sb2));
        System.out.println(sb1.hashCode() == sb2.hashCode());

        System.out.println(sb1.toString().contentEquals(sb2));
    }
}
