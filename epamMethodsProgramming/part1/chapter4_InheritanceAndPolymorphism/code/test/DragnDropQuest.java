package epamMethodsProgramming.part1.chapter4_InheritanceAndPolymorphism.code.test;

/**
 * Created by Alexander on 9/1/2016.
 */
public class DragnDropQuest extends AbstractQuest {
    @Override
    public boolean check(Answer ans) {
        System.out.println("Dran'n'Drop quest");
        return true;
    }
}
