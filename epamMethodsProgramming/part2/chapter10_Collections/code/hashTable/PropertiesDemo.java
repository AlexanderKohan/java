package epamMethodsProgramming.part2.chapter10_Collections.code.hashTable;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Alexander on 9/12/2016.
 */
public class PropertiesDemo {
    public static void main(String[ ] args) {
        Properties props = new Properties();
        try {
// загрузка пар ключ-значение через поток ввода-вывода
            props.load(new FileReader("prop\\database.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String driver = props.getProperty("db.driver");
// следующих двух ключей в файле нет
        String maxIdle = props.getProperty("db.maxIdle"); // будет присвоен null
// значение "20" будет присвоено ключу, если он не будет найден в файле
        String maxActive = props.getProperty("db.maxActive", "20");
        System.out.println(driver);
        System.out.println(maxIdle);
        System.out.println(maxActive);
    }
}
