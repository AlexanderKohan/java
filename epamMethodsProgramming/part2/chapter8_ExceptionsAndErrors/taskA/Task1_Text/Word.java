package epamMethodsProgramming.part2.chapter8_ExceptionsAndErrors.taskA.Task1_Text;

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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (getClass() != obj.getClass())
            return false;
        Word other = (Word) obj;
        if (word != other.word) return false;

        return true;
    }



    @Override
    public int hashCode() {
        return (int) (31 * (word == null ? word.hashCode() : word.hashCode()));
    }

    @Override
    public String toString() {
        return getClass().getName() + "@name" + word;
    }
}
