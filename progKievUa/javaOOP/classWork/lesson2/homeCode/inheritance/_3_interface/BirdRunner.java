package progKievUa.javaOOP.classWork.lesson2.homeCode.inheritance._3_interface;

import progKievUa.javaOOP.classWork.lesson2.homeCode.inheritance._3_interface.bird.Duck;
import progKievUa.javaOOP.classWork.lesson2.homeCode.inheritance._3_interface.bird.Eagle;
import progKievUa.javaOOP.classWork.lesson2.homeCode.inheritance._3_interface.bird.Flyable;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bohdan Vanchuhov
 */
public class BirdRunner {
    public static void main(String[] args) {
        List<Flyable> flyables = new ArrayList<>();
        flyables.add(new Duck());
        flyables.add(new Eagle());

        for (Flyable flyable : flyables) {
            flyable.fly();
        }
    }
}
