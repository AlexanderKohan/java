package epamMethodsProgramming.part2.chapter11_Multithreading.code.exchangeLocks;

/**
 * Created by Alexander on 9/17/2016.
 */
public class Item {
    private Integer id;
    private Integer number;
    public Item(Integer id, Integer number) {
        super();
        this.id = id;
        this.number = number;
    }
    public Integer getId() {
        return id;
    }
    public Integer getNumber() {
        return number;
    }
}
