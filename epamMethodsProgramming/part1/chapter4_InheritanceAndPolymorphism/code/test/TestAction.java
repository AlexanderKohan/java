package epamMethodsProgramming.part1.chapter4_InheritanceAndPolymorphism.code.test;

import java.util.Random;

/**
 * Created by Alexander on 9/1/2016.
 */
public class TestAction {
    public AbstractQuest[] generateTest(final int NUMBER_QUEST, int maxMode) {
        AbstractQuest[] test = new AbstractQuest[NUMBER_QUEST];
        for (int i = 0; i < test.length; i++) {
            int mode = new Random().nextInt(maxMode);
            test[i] = QuestFactory.getQuestFromFactory(mode);
        }
        return test;
    }

    public int checkTest(AbstractQuest[] test) {
        int counter = 0;
        for (AbstractQuest s : test) {
            counter = s.check(new Answer()) ? ++counter : counter;
        }
        return counter;
    }
}
