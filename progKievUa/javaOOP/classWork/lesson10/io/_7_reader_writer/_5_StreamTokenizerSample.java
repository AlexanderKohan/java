package progKievUa.javaOOP.classWork.lesson10.io._7_reader_writer;

import java.io.IOException;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.io.StringReader;

/**
 * @author Bohdan Vanchuhov
 */
public class _5_StreamTokenizerSample {
    public static void main(String[] args) {
        Reader stringReader = new StringReader("Hello 123");
        StreamTokenizer tokenizer = new StreamTokenizer(stringReader);

        try {
            doTask(tokenizer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void doTask(StreamTokenizer tokenizer) throws IOException {
        int tokenType = tokenizer.nextToken();
        if (tokenType == StreamTokenizer.TT_WORD) {
            System.out.println(tokenizer.sval);
        }
    }
}
