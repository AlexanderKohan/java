package epamMethodsProgramming.part2.chapter9_IOStreams.code.chars;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Alexander on 9/4/2016.
 */
public class ReadDemo {
    public static void main(String[] args) {
        String file = "data\\file.txt";
        File f = new File(file); // объект для связи с файлом на диске
        int b, count = 0;
        FileReader is = null;
// FileInputStream is = null; // альтернатива
        try {
            is = new FileReader(f);
// is = new FileInputStream(f);
            while ((b = is.read()) != -1) { // чтение
                System.out.print((char) b);
                count++;
            }
            System.out.print("\n число байт = " + count);
        } catch (IOException e) {
            System.err.println("Ошибка файла: " + e);
        } finally {
            try {
                if (is != null) {
                    is.close(); // закрытие потока ввода
                }
            } catch (IOException e) {
                System.err.println("ошибка закрытия: " + e);
            }
        }
    }
}
