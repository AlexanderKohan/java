package epamMethodsProgramming.part2.chapter11_Multithreading.code.exchangeLocks;

import java.util.concurrent.Exchanger;

/**
 * Created by Alexander on 9/17/2016.
 */
public class Subject {
    protected static Exchanger<Item> exchanger = new Exchanger<>();
    private String name;
    protected Item item;

    public Subject(String name, Item item) {
        this.name = name;
        this.item = item;
    }

    public String getName() {
        return name;
    }

    public Item getItem() {
        return item;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
