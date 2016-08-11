package com.bvan.teaching.javastart.groups.group27.lesson5;

/**
 * @author bvanchuhov
 */
public class EvensPrinter {

    public static void main(String[] args) {
        int from = 1;
        int to = 10;

        if (from % 2 != 0) {
            from++;
        }
        for (int i = from; i <= to; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
