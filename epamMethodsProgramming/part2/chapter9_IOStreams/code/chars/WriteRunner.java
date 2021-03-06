package epamMethodsProgramming.part2.chapter9_IOStreams.code.chars;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Alexander on 9/4/2016.
 */
public class WriteRunner {
    public static void main(String[] args) {
        String pArray[] = {"2013 ", "Java SE 8"};
        File fbyte = new File("/*data\\*/byte.data");
        File fsymb = new File("/*data\\*/symbol.txt");
        FileOutputStream fos = null;
        FileWriter fw = null;
        try {
            fos = new FileOutputStream(fbyte);
            fw = new FileWriter(fsymb);
            for (String a : pArray) {
                fos.write(a.getBytes());
                fw.write(a);
            }
        } catch (IOException e) {
            System.err.println("ошибка записи: " + e);
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
// ниже некорректно!
// каждому close() требуется свой try-catch
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                System.err.println("ошибка закрытия потока: " + e);
            }
        }
    }
}
