package epamMethodsProgramming.part2.chapter7_Strings.code.string;

/**
 * Created by Alexander on 9/3/2016.
 */
public class RefString {
    public static void changeStr(String s) {
        s = s.concat(" Certified"); // создается новая строка
// или s.concat(" Certified");
// или s += " Certified";
    }

    public static void main(String[] args) {
        String str = new String("Java");
        changeStr(str);
        System.out.print(str);
    }
}
