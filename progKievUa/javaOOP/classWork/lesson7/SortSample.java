/*
package progKievUa.javaOOP.classWork.lesson7;

import progKievUa.javaOOP.classWork.lesson7.javaOopGenericsComparisonIterationList.javaoop.person.Person;

import java.util.*;

import java.util.Comparator;

*/
/**
 * @author bvanchuhov
 *//*


public class SortSample {
    public static void main(String[] args) {
        List<Integer> integerList =
                new ArrayList<>(Arrays.asList(10, 1, 2, 4));
        integerList.sort(Collections.reverseOrder());
        System.out.println(integerList);

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Fill", 15));
        persons.add(new Person("Bob", 30));
        persons.add(new Person("John", 25));

        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person a, Person b) {
                return Integer.compare(
                        a.getName().length(),
                        b.getName().length()
                );
            }
        });
        System.out.println(persons);
    }
}
class AgeComporator implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(p1.getAge(), p2.getAge());
    }
}
*/
