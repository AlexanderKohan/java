package progKievUa.javaOOP.classWork.lesson10.io._8_random_access_file;

import progKievUa.javaOOP.classWork.lesson10.io.TestIOUtils;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author Bohdan Vanchuhov
 */
public class RandomAccessFileSample {
    public static final String FILE_NAME = "files/io/raf_sample.in";
    public static final String READ_WRITE_MODE = "rw";

    public static void main(String[] args) {
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(FILE_NAME, READ_WRITE_MODE)) {
            doTask(randomAccessFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void doTask(RandomAccessFile randomAccessFile) throws IOException {
        System.out.println(randomAccessFile.readByte());

        randomAccessFile.seek(5);
        System.out.println(randomAccessFile.readByte());

        randomAccessFile.writeByte(95); // _

        TestIOUtils.waitInput();
    }
}
