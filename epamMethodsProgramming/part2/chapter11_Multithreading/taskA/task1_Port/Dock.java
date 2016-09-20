package epamMethodsProgramming.part2.chapter11_Multithreading.taskA.task1_Port;

/**
 * Created by Alexander on 9/18/2016.
 */
public interface Dock {

    public int load(int max);

    public boolean place(int weight);

    public boolean dock();

    public void sail();

}
