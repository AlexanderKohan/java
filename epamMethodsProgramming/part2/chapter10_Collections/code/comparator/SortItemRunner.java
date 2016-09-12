package epamMethodsProgramming.part2.chapter10_Collections.code.comparator;

import epamMethodsProgramming.part2.chapter10_Collections.code.arrayList.uncheck.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Alexander on 9/12/2016.
 */
public class SortItemRunner {
    public static void main(String[ ] args) {
        ArrayList<Item> p = new ArrayList<Item>() {
            {
                add(new Item(52201, 9.75f, "T-Shirt"));
                add(new Item(52127, 13.99f, "Dress"));
                add(new Item(47063, 45.95f, "Jeans"));
                add(new Item(90428, 60.9f, "Gloves"));
                add(new Item(53295, 31f, "Shirt"));
                add(new Item(63220, 14.9f, "Tie"));
            }
        };
// создание компаратора
        Comparator<Item> comp = new Comparator<Item>() {
            // сравнение для сортировки по убыванию цены товара
            @Override
            public int compare(Item one, Item two) {
                return (int) (one.getPrice() - two.getPrice());
            }
// public boolean equals(Object ob) { /* реализация */ }
        };
// сортировка списка объектов
        Collections.sort(p, comp);
        System.out.println(p);
    }
}
