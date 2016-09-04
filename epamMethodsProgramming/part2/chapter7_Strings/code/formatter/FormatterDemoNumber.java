package epamMethodsProgramming.part2.chapter7_Strings.code.formatter;

import java.util.Formatter;

/**
 * Created by Alexander on 9/4/2016.
 */
public class FormatterDemoNumber {
    public static void main(String[] args) {
        Formatter f = new Formatter();
        f.format("Hex: %x, Octal: %o", 100, 100);
        System.out.println(f);
        f = new Formatter();
        f.format("%a", 100.001);
        System.out.println(f);
        f = new Formatter();
        for (double i = 1000; i < 1.0e+10; i *= 100) {
            f.format("%g ", i);
            System.out.println(f);
        }
    }
}
