package epamMethodsProgramming.part2.chapter8_ExceptionsAndErrors.taskA.Task1_Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexander on 7/31/2016.
 */
public class Text {

    private List<Sentence> text = new ArrayList<>();
    private Sentence header;

    public Text() {
    }

    public Text(Sentence sentence, Sentence topicText) {
        this.header = topicText;
        text.add(this.header);
        text.add(sentence);
    }

    public void addText(Sentence sentence) {
        text.add(sentence);
    }

    public void printText() {
        for (Sentence sentence : text) {
            sentence.printSentence();
        }
    }
}
