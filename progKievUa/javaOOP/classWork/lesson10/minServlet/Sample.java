package progKievUa.javaOOP.classWork.lesson10.minServlet;

import java.io.*;

/**
 * @author bvanchuhov
 */
public class Sample {
    public static final String INPUT_FILE = "files/min_sample.txt";
    public static final String OUTPUT_FILE = "files/min_sample.out";
    private static Servlet servlet = new MinServlet();

    public static void main(String[] args) {
        BufferedReader reader = null;
        PrintWriter writer = null;

        try {
            reader = new BufferedReader(new FileReader(INPUT_FILE));
            writer = new PrintWriter(new FileWriter(OUTPUT_FILE));

            servlet.execute(reader, writer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeReader(reader);
            closeWriter(writer);
        }
    }

    private static void closeReader(BufferedReader reader) {
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void closeWriter(PrintWriter writer) {
        if (writer != null) {
            writer.close();
        }
    }
}
