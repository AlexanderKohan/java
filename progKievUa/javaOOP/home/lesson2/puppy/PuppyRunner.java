package java.progKievUa.javaOOP.home.lesson2.puppy;

/**
 * Created by Alexander on 7/21/2016.
 */
public class PuppyRunner {
    public static void main(String[] args) {

        Puppy puppy = new Puppy("Jack");

        System.out.println(puppy);
        System.out.println(puppy.bark());
        System.out.println(puppy.jump());
        System.out.println(puppy.run());
        System.out.println(puppy.bite());
    }
}
