package epamMethodsProgramming.part2.chapter7_Strings.code.numberFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Alexander on 9/4/2016.
 */
public class DateFormats {

    public static void main(String[] args) {
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM, new Locale("RU"));
        String string = dateFormat.format(new Date());
        System.out.println(string);
    }
}
