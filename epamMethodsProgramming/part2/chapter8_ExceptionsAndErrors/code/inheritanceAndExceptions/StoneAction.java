package epamMethodsProgramming.part2.chapter8_ExceptionsAndErrors.code.inheritanceAndExceptions;

import java.text.ParseException;

/**
 * Created by Alexander on 9/4/2016.
 */
public class StoneAction { // ранее созданный класс
    public void buildHouse(Stone stone) {
        try {
            stone.build("some info");
// предусмотрена обработка ParseException и его подклассов
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
