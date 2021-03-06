package progKievUa.javaOOP.home.lesson3.text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexander on 7/31/2016.
 */
public class Sentence {

    private List<Word> sentence = new ArrayList<>();

    public Sentence() {
    }

    public Sentence(List<Word> sentence) {
        this.sentence = sentence;
    }

    public List<Word> getSentence() {
        return sentence;
    }

    public void setSentence(List<Word> sentence) {
        this.sentence = sentence;
    }

    public List<Word> addWord(Word newWord) {
        sentence.add(newWord);
        return sentence;
    }

    public void printSentence() {
        for (Word word : sentence) {
            System.out.print(word.getWord() + " ");
        }
        System.out.println();
    }
}
