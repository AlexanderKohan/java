package progKievUa.javaOOP.home.lesson9.numbersCounter;

import java.util.*;

/**
 * Created by Alexander on 8/22/2016.
 */

public class NumbersCounter {
    public static void main(String[] args) {
        List<Integer> list = createList();
        Map<Integer, Integer> integerMap = new HashMap<>();

        countIntager(list, integerMap);
    }

    private static void countIntager(List<Integer> list, Map<Integer, Integer> integerMap) {
        for (int count : list) {
            if (!integerMap.containsKey(count)) {
                integerMap.put(count, 1);
            } else {
                integerMap.put(count, integerMap.get(count) + 1);
            }
        }
        System.out.println(integerMap);
    }


    private static List<Integer> createList() {
        return new ArrayList<>(Arrays.asList(
                1, 2, 3, 2, 1, 6, 3, 7, 3, 2, 6, 8, 9, 2, 5, 6, 1, 7, 9, 0, 2, 3, 5
        ));
    }
}
