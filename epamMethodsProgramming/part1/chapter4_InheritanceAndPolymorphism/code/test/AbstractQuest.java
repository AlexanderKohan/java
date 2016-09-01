package epamMethodsProgramming.part1.chapter4_InheritanceAndPolymorphism.code.test;

/**
 * Created by Alexander on 9/1/2016.
 */
public abstract class AbstractQuest {

    private long id;
    private String questContent;

    public abstract boolean check(Answer ans);
}
