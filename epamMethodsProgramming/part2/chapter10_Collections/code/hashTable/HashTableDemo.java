package epamMethodsProgramming.part2.chapter10_Collections.code.hashTable;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Created by Alexander on 9/12/2016.
 */
public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, Double> ht = new Hashtable<Integer, Double>() {
            {
                for (int i = 0; i < 5; i++) {
                    this.put(i, Math.atan(i));
                }
            }
        };
        Enumeration<Integer> ek = ht.keys();
        int key;
        while (ek.hasMoreElements()) {
            key = ek.nextElement();
            System.out.printf("%4d ", key);
        }
        System.out.println("");
        Enumeration<Double> ev = ht.elements();
        double value;
        while (ev.hasMoreElements()) {
            value = ev.nextElement();
            System.out.printf("%.2f ", value);
        }
    }
}
