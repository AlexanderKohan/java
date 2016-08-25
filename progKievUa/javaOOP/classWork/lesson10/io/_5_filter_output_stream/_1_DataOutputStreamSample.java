package progKievUa.javaOOP.classWork.lesson10.io._5_filter_output_stream;

import java.io.DataOutputStream;
import java.io.IOException;

/**
 * @author Bohdan Vanchuhov
 */
public class _1_DataOutputStreamSample {
    public static void main(String[] args) {
        try (DataOutputStream dataOutputStream = new DataOutputStream(System.out)) {
            doTask(dataOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void doTask(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(49);
        dataOutputStream.writeLong(65);
    }
}
