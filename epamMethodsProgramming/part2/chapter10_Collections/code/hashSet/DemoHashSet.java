package epamMethodsProgramming.part2.chapter10_Collections.code.hashSet;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by Alexander on 9/12/2016.
 */
public class DemoHashSet {
    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(100);
        long callTime = System.nanoTime();
        Scanner scan = null;
        try {
            scan = new Scanner(new File("texts\\nabokov.txt"));
            scan.useDelimiter("[^А-я]+");
            while (scan.hasNext()) {
                String word = scan.next();
                words.add(word.toLowerCase());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Iterator<String> it = words.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        TreeSet<String> ts = new TreeSet<>(words);
        System.out.println(ts);
        long totalTime = System.nanoTime() - callTime;
        System.out.println("различных слов: " + words.size() + ", "
                + totalTime + " наносекунд");
    }
}
