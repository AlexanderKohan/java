package progKievUa.javaOOP.home.lesson3.text;

/**
 * Created by Alexander on 7/31/2016.
 */

public class Word {

    private String word;

    public Word(String newWord) {
        this.word = newWord;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return "Word{" +
                "word='" + word + '\'' +
                '}';
    }
}
