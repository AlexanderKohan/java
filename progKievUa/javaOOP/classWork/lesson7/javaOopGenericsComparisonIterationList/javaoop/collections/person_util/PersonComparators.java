package progKievUa.javaOOP.classWork.lesson7.javaOopGenericsComparisonIterationList.javaoop.collections.person_util;

import progKievUa.javaOOP.classWork.lesson7.javaOopGenericsComparisonIterationList.javaoop.person.Person;

import java.util.Comparator;

/**
 * @author Bohdan Vanchuhov
 */
public final class PersonComparators {
    private PersonComparators() {}

    private static class NameComparator implements Comparator<Person> {
        private boolean isAscend;

        public NameComparator(boolean isAscend) {
            this.isAscend = isAscend;
        }

        @Override
        public int compare(Person p1, Person p2) {
            int ascendCoef = isAscend ? 1 : -1;
            return p1.getName().compareTo(p2.getName()) * ascendCoef;
        }
    }

    public static Comparator<Person> nameComparator(boolean isAscend) {
        return new NameComparator(isAscend);
    }

    public static Comparator<Person> ageComparator(final boolean isAscend) {
        return new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                int ascendCoef = isAscend ? 1 : -1;
                return Integer.compare(p1.getAge(), p2.getAge()) * ascendCoef;
            }
        };
    }
}
