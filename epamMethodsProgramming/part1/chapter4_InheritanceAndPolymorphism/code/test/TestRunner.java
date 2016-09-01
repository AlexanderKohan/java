package epamMethodsProgramming.part1.chapter4_InheritanceAndPolymorphism.code.test;

/**
 * Created by Alexander on 9/1/2016.
 */
public class TestRunner {
    public static void main(String[] args) {

        TestAction testAction = new TestAction();

        AbstractQuest[] test = testAction.generateTest(60, 2);

        testAction.checkTest(test);
    }
}
