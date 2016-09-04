package epamMethodsProgramming.part2.chapter7_Strings.code.locale;

import java.util.Locale;

/**
 * Created by Alexander on 9/3/2016.
 */
public class LocaleLanguage {
    public static void main(String[] args) {

        java.util.Locale locale = java.util.Locale.getDefault();
        System.out.println(locale.getCountry());
        System.out.println(locale.getDisplayCountry());
        System.out.println(locale.getLanguage());
        System.out.println(locale.getDisplayLanguage());
    }
}
