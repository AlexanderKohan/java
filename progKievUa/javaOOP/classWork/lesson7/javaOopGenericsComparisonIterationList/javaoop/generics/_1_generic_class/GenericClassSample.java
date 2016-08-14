package progKievUa.javaOOP.classWork.lesson7.javaOopGenericsComparisonIterationList.javaoop.generics._1_generic_class;

import progKievUa.javaOOP.classWork.lesson7.javaOopGenericsComparisonIterationList.javaoop.person.Person;

/**
 * @author Bohdan Vanchuhov
 */
public class GenericClassSample {
    public static void main(String[] args) {
        Person person = new Person("John", 25);

        ObjectWrapper personWrapper = new ObjectWrapper(person);
        usePersonWrapper(personWrapper);

        Wrapper<Person> wrapper = new Wrapper<>(person);
        useWrapper(wrapper);
    }

    public static void usePersonWrapper(ObjectWrapper personWrapper) {
        Object value = personWrapper.getValue();

        if (value instanceof Person) {
            Person person = (Person) personWrapper.getValue();
            System.out.println(person);
        }
    }

    public static void useWrapper(Wrapper<Person> personWrapper) {
        Person person = personWrapper.getValue();
        System.out.println(person);
    }
}
