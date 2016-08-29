package progKievUa.javaOOP.home.lesson11.factorial;

import java.io.*;
import java.math.BigInteger;
import java.nio.charset.Charset;

/**
 * Created by Alexander on 8/29/2016.
 */
public class FactorialIO {

    private final int fileName;

    public FactorialIO(int fileName) {
        this.fileName = fileName;
    }


    public void outputFactorialToFile(BigInteger factorial) {
        Writer writer = null;
        try {
            writer = new OutputStreamWriter(new FileOutputStream("factorial_" + fileName + ".txt"),
                    Charset.defaultCharset());
            writer.write(String.valueOf(factorial));
        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
}