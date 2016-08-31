package epamMethodsProgramming.part1.chapter1_introducingInOOP.tests;

/**
 * Created by Alexander on 8/31/2016.
 */
public class EqString {
    public static void main(String[] args) {
        String s;
        if ((s = "java") == "java") {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
