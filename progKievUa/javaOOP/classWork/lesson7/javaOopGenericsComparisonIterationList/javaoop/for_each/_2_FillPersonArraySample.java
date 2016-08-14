package progKievUa.javaOOP.classWork.lesson7.javaOopGenericsComparisonIterationList.javaoop.for_each;

import progKievUa.javaOOP.classWork.lesson7.javaOopGenericsComparisonIterationList.javaoop.person.Person;

import java.util.Arrays;

/**
 * @author Bohdan Vanchuhov
 */
public class _2_FillPersonArraySample {
    public static void main(String[] args) {
        Person[] persons = new Person[10];

        for (Person person : persons) {
            person = new Person("Bohdan");
        }
        System.out.println(Arrays.toString(persons));
    }
}
