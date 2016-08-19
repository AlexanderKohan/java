package progKievUa.javaOOP.classWork.lesson9.hashtable.elems_contract.without_contract;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Alexander on 8/19/2016.
 */
public class HashTableElemsWithoutContract {

    public static void main(String[] args) {
        Set<Wrapper> set = new HashSet<>();

        set.add(new Wrapper(10));
        set.add(new Wrapper(10));

        System.out.println(set); // Элементы повторяются
    }
}

class Wrapper {

    private final int value;

    public Wrapper(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
