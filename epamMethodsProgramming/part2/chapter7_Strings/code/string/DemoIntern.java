package epamMethodsProgramming.part2.chapter7_Strings.code.string;

/**
 * Created by Alexander on 9/3/2016.
 */
public class DemoIntern {
    public static void main(String[ ] args) {
        String s1 = "Java"; // литерал и ссылка на него
        String s2 = new String("Java");
        System.out.println(s1 == s2); // false
        s2 = s2.intern();
        System.out.println(s1 == s2); // true
    }
}
