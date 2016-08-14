package progKievUa.javaOOP.classWork.lesson7.javaOopGenericsComparisonIterationList.javaoop.collections._2_iteration._3_iterable_person;

import progKievUa.javaOOP.classWork.lesson7.javaOopGenericsComparisonIterationList.javaoop.person.Person;

import java.util.Iterator;

/**
 * @author Bohdan Vanchuhov
 */
public class IterablePerson extends Person implements Iterable<Character> {
    public IterablePerson(String name, int age) {
        super(name, age);
    }

    @Override
    public Iterator<Character> iterator() {
        return new PersonIterator();
    }

    class PersonIterator implements Iterator<Character> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < name.length();
        }

        @Override
        public Character next() {
            return name.charAt(currentIndex++);
        }
    }
}
