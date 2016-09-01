package epamMethodsProgramming.part1.chapter4_InheritanceAndPolymorphism.code.test;

/**
 * Created by Alexander on 9/1/2016.
 */
public class SingleChoiceQuest extends AbstractQuest {

    @Override
    public boolean check(Answer ans) {
        System.out.println("Single choice quest");
        return true;
    }
}
