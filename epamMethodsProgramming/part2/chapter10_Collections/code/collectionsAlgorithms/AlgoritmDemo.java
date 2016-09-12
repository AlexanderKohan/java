package epamMethodsProgramming.part2.chapter10_Collections.code.collectionsAlgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Alexander on 9/12/2016.
 */
public class AlgoritmDemo {
    public static void main(String[] args) {
        Comparator<Integer> comp = new Comparator<Integer>() {
            public int compare(Integer n, Integer m) {
                return m.intValue() - n.intValue();
            }
        };
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 1, 2, 3, 4, 5);
        Collections.shuffle(list);
        print(list);
        Collections.sort(list, comp);
        print(list);
        Collections.reverse(list);
        print(list);
        Collections.rotate(list, 3);
        print(list);
        System.out.println("min: " + Collections.min(list, comp));
        System.out.println("max: " + Collections.max(list, comp));
        List<Integer> singl = Collections.singletonList(71);
        print(singl);
// singl.add(21); // ошибка времени выполнения
    }

    private static void print(List<Integer> c) {
        for (int i : c) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
