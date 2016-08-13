package java.progKievUa.javaOOP.classWork.lesson2.person;

/**
 * Created by Alexander on 7/20/2016.
 */
public class PersonRunner {

    public static void main(String[] args) {
        Person person = new Person("John", 25);
        System.out.println(person);

        String personInfo = person.sayHello();
        System.out.println(personInfo);
    }
}