/*
package progKievUa.javaOOP.classWork.lesson7;

import com.bvan.teaching.javaoop.courceproject.person.comparison.MultiComparator;
import com.bvan.teaching.javaoop.courceproject.person.comparison.OrderedComparator;
import com.bvan.teaching.javaoop.courceproject.person.entity.Person;
import com.bvan.teaching.javaoop.courceproject.person.filtering.Filter;
import com.bvan.teaching.javaoop.courceproject.persokn.filtering.NamePredicate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.bvan.teaching.javaoop.courceproject.person.comparison.OrderedComparator.Order.ASC;
import static com.bvan.teaching.javaoop.courceproject.person.comparison.OrderedComparator.Order.DESC;
import static com.bvan.teaching.javaoop.courceproject.person.comparison.PersonComparator.*;

*/
/**
 * @author bvanchuhov
 *//*

public class Runner {

    public static void main(String[] args) {
        List<Person> persons = createPersons();

        persons = Filter.filter(persons, new NamePredicate("John"));

        Collections.sort(persons, new MultiComparator<>(
                        new OrderedComparator<>(AGE, DESC),
                        new OrderedComparator<>(NAME, ASC),
                        new OrderedComparator<>(ID, DESC)
        ));

        printPersons(persons);
    }

    private static List<Person> createPersons() {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("John", 30));
        persons.add(new Person("Bob", 30));
        persons.add(new Person("John", 15));
        persons.add(new Person("Alan", 20));
        persons.add(new Person("John", 15));

        return persons;
    }

    private static void printPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
*/
