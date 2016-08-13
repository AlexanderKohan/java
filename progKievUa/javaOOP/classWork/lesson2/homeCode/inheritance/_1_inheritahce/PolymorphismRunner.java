package progKievUa.javaOOP.classWork.lesson2.homeCode.inheritance._1_inheritahce;

import progKievUa.javaOOP.classWork.lesson2.homeCode.inheritance._1_inheritahce.person.Person;
import progKievUa.javaOOP.classWork.lesson2.homeCode.inheritance._1_inheritahce.person.Student;

/**
 * Created on 02.06.2015
 *
 * @author Bohdan Vanchuhov
 */
public class PolymorphismRunner {
    public static void main(String[] args) {
        Person person = new Student("John", "Smith");

        printHello(person);
    }

    private static void printHello(Person person) {
        System.out.println(person.sayHello());
    }
}
