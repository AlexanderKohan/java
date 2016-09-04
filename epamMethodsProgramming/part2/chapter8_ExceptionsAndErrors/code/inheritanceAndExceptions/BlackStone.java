package epamMethodsProgramming.part2.chapter8_ExceptionsAndErrors.code.inheritanceAndExceptions;

/**
 * Created by Alexander on 9/4/2016.
 */

public class BlackStone extends Stone { // новый класс
    @Override
    public void build(String data) throws Exception { // ошибка компиляции
        System.out.println("черный каменный шар");
/* реализация*/
    }
}
