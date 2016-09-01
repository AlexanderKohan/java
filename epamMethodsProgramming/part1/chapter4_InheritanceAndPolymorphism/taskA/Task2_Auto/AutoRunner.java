package epamMethodsProgramming.part1.chapter4_InheritanceAndPolymorphism.taskA.Task2_Auto;

import java.util.List;

/**
 * Created by Alexander on 9/1/2016.
 */
public class AutoRunner {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Mercedes","X5");


        System.out.println(auto1.getMark());
        auto1.move();
        auto1.refuel();
        auto1.changeWheel();
    }
}
