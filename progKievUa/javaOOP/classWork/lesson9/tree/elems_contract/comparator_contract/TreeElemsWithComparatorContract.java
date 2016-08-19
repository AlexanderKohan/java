package progKievUa.javaOOP.classWork.lesson9.tree.elems_contract.comparator_contract;

import progKievUa.javaOOP.classWork.lesson7.javaOopGenericsComparisonIterationList.javaoop.person.Person;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Alexander on 8/19/2016.
 */
public class TreeElemsWithComparatorContract {

    public static void main(String[] args) {
        Set<Person> personSet = new TreeSet<>(new PersonAgeComparator());

        personSet.add(new Person("John", 25));
        personSet.add(new Person("Bob", 30));
        personSet.add(new Person("Phill", 20));

        System.out.println(personSet);
    }
}

class PersonAgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person a, Person b) {
        return Integer.compare(a.getAge(), b.getAge());
    }
}
