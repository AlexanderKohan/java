package progKievUa.javaOOP.classWork.lesson2.homeCode.encapsulation._3_with_method;

/**
 * @author Bohdan Vanchuhov
 */
public class WithMethodSample {
    public static void main(String[] args) {
        Person person = new Person("John", 25);
        person.sayHello();

        int age = person.age;
        System.out.println(age);

        person.age = -100;
        person.sayHello();
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello, I'm " + name + ", " + age + " years old");
    }
}