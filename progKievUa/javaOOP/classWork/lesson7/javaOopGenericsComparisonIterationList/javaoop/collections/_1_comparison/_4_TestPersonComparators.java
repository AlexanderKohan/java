package progKievUa.javaOOP.classWork.lesson7.javaOopGenericsComparisonIterationList.javaoop.collections._1_comparison;


import progKievUa.javaOOP.classWork.lesson7.javaOopGenericsComparisonIterationList.javaoop.collections.person_util.PersonComparators;
import progKievUa.javaOOP.classWork.lesson7.javaOopGenericsComparisonIterationList.javaoop.collections.person_util.PersonUtil;
import progKievUa.javaOOP.classWork.lesson7.javaOopGenericsComparisonIterationList.javaoop.person.Person;

import java.util.List;

/**
 * @author Bohdan Vanchuhov
 */
public class _4_TestPersonComparators {
    public static void main(String[] args) {
        List<Person> persons = PersonUtil.createDefaultPersons();
        System.out.println(persons);

        persons.sort(PersonComparators.nameComparator(false));
        System.out.println(persons);
    }
}
