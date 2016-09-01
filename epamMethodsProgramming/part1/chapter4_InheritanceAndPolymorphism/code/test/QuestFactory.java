package epamMethodsProgramming.part1.chapter4_InheritanceAndPolymorphism.code.test;

/**
 * Created by Alexander on 9/1/2016.
 */
public class QuestFactory {
    public static AbstractQuest getQuestFromFactory(int mode) {
        switch (mode) {
            case 0:
                return new DragnDropQuest();
            case 2:
                return new SingleChoiceQuest();
            default:
                throw new IllegalArgumentException("illegal mode");
        }
    }
}
