package epamMethodsProgramming.part2.chapter7_Strings.code.numberFormat;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by Alexander on 9/4/2016.
 */
public class NumberFormatExample {
    NumberFormat numberFormat = NumberFormat.getInstance(new Locale("RU"));
    NumberFormat numberFormatDefault = NumberFormat.getInstance();
}
