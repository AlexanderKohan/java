package epamMethodsProgramming.part2.chapter8_ExceptionsAndErrors.code.generateExceptions;

/**
 * Created by Alexander on 9/4/2016.
 */
public class ResourceAction {
    public void doAction() {
        SameResource sr = null;
        try {
// реализация — захват ресурсов
            sr = new SameResource(); // возможна генерация исключения
// реализация — использование ресурсов
            sr.execute(); // возможна генерация исключения
// sr.close(); // освобождение ресурсов (некорректно)
        } finally {
// освобождение ресурсов (корректно)
            if (sr != null) {
                sr.close();
            }
        }
        System.out.print("after finally");
    }
}
