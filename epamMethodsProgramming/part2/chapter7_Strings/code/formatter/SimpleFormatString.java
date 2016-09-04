package epamMethodsProgramming.part2.chapter7_Strings.code.formatter;

import java.util.Formatter;

/**
 * Created by Alexander on 9/4/2016.
 */
public class SimpleFormatString {
    public static void main(String[ ] args){
        Formatter f = new Formatter(); // объявление объекта
// форматирование текста по формату %S, %c
        f.format("This %s is about %n%S %c", "book", "java", '8');
        System.out.print(f);
    }
}
