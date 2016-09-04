package epamMethodsProgramming.part2.chapter8_ExceptionsAndErrors.taskA.Task1_Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexander on 7/31/2016.
 */
public class TextRunner {
    public static void main(String[] args) {
        String header = "HEADER";
        String sentenceFirst = "Success doesn't come to you…you go to it.";
        String sentenceSecond = "Formal education will make you a living. Self-education will make you a fortune.";

        Sentence topic = new Sentence(createSentence(header));
        Sentence sentence1 = new Sentence(createSentence(sentenceFirst));
        Sentence sentence2 = new Sentence(createSentence(sentenceSecond));

        Text text = new Text(sentence1, topic);
        text.addText(sentence2);

        text.printText();
    }

    private static List<Word> createSentence(String inputString) {

        List<Word> result = new ArrayList<>();
        String[] string = inputString.split(" ");
        for (String s : string) {
            result.add(new Word(s));
        }
        return result;
    }
}
