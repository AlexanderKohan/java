package progKievUa.javaOOP.home.lesson7.generics.namesComparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Alexander on 8/28/2016.
 */
public class NamesComparing {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alexander");
        names.add("Anna");
        names.add("Roman");
        names.add("Julia");
        names.add("Stephan");
        names.add("Alexei");
        names.add("Roman");
        names.add("Janek");

        printList(names);

        sortByName(names);

        reverseSortByName(names);

        findMinName(names);

        byAmountLetters(names);
        System.out.println(names);

        byAmountLettersSuper(names);
        System.out.println(names);
    }

    private static void byAmountLettersSuper(List<String> names) {
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int comp = Integer.compare(o1.length(), o2.length());
                if (comp == 0) return o2.compareTo(o1);
                else return comp;
            }
        });
        System.out.print("Sort by letters super method: ");
    }

    private static void byAmountLetters(List<String> names) {
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
        System.out.print("Sort by letters: ");
    }

    private static void findMinName(List<String> names) {
        String minName = Collections.min(names);
        System.out.println("Print min name: " + minName);
    }

    private static void reverseSortByName(List<String> names) {
        Collections.sort(names, Collections.reverseOrder());
        System.out.println("Print by reverse names: " + names + " ");
    }

    private static void sortByName(List<String> names) {
        Collections.sort(names);
        System.out.print("Print by names: " + names + " ");
        System.out.println();
    }

    private static void printList(List<String> list) {
        System.out.print("Print list: ");
        for (Object o : list) {
            System.out.print(o + " ");
        }
        System.out.println();
    }
}
