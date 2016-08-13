package progKievUa.javaOOP.classWork.lesson2.classCode.dog;

/**
 * Created by Alexander on 7/19/2016.
 */
public class DogRunner {

    public static void main(String[] args) {
        Dog dog = new Dog("Rex", "John");
        dog.bark();

        System.out.println(dog);
    }
}