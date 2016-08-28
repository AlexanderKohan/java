package progKievUa.javaOOP.home.lesson7.generics.personFiltering_Sorting;

import progKievUa.javaOOP.classWork.lesson10.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Alexander on 8/28/2016.
 */

public class PersonSortList {
    public static void main(String[] args) {
        List<Person> persons = createList();

        printList(persons);

        System.out.println();


        List<Person> teens = filterTeensPersons(persons);
        printList(teens);

    }

    private static List<Person> filterTeensPersons(List<Person> persons) {
        List<Person> teens = new ArrayList<>();

        for (Person person : persons) {
            if (person.getAge() >= 12 && person.getAge() <= 17) teens.add(person);
        }
        Collections.sort(teens, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getAge() == o2.getAge()) return o1.getName().compareTo(o2.getName());
                else return Integer.compare(o1.getAge(), o2.getAge());
            }
        });
        return teens;
    }

    private static void printList(List<Person> persons) {
        for (Object o : persons) {
            System.out.println(o);
        }
    }

    private static List<Person> createList() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(1, "Alexander", 23));
        persons.add(new Person(1, "Julia", 12));
        persons.add(new Person(1, "Roman", 15));
        persons.add(new Person(1, "Alla", 17));
        persons.add(new Person(1, "Michael", 20));
        persons.add(new Person(1, "Nadya", 8));
        return persons;
    }
}
