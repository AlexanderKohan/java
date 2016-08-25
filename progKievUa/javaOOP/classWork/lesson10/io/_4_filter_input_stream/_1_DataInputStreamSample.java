package progKievUa.javaOOP.classWork.lesson10.io._4_filter_input_stream;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Bohdan Vanchuhov
 */
public class _1_DataInputStreamSample {
    public static void main(String[] args) {
        byte[] bytes = {
                0, 0, 0, 10,
                0, 0, 0, 0, 0, 0, 0, 20
        };

        InputStream sourceInputStream = new ByteArrayInputStream(bytes);
        try (DataInputStream dataInputStream = new DataInputStream(sourceInputStream)) {
            doTask(dataInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void doTask(DataInputStream dataInputStream) throws IOException {
        System.out.println(dataInputStream.readInt());
        System.out.println(dataInputStream.readLong());
    }
}
