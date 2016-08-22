package progKievUa.javaOOP.home.lesson9.uniqueSortedPersons;

import java.util.*;

/**
 * Created by Alexander on 8/22/2016.
 */

public class UniqueSortedPersons {
    public static void main(String[] args) {
        List<Person> persons = createPersons();
        Map<String, Person> nameToPersonMap = prepareNameToPersonMap(persons);

        printAlphabetPersons(nameToPersonMap);
    }

    private static List<Person> createPersons() {
        return new ArrayList<>(Arrays.asList(
                new Person("Julia", 28),
                new Person("Alex", 33),
                new Person("Nadya", 22),
                new Person("Tatiana", 43),
                new Person("Ivan", 34),
                new Person("Anastasia", 23),
                new Person("Stephan", 19),
                new Person("Anna", 22),
                new Person("Anton", 25)
        ));
    }

    private static void printAlphabetPersons(Map<String, Person> map) {
        Collection<Person> values = map.values();
        for (Person value : values) {
            System.out.println(value);
        }
    }

    private static Map<String, Person> prepareNameToPersonMap(List<Person> persons) {
        Map<String, Person> nameToPersonMap = new TreeMap<>();
        for (Person person : persons) {
            nameToPersonMap.put(person.getName(), person);
        }
        return nameToPersonMap;
    }
}
