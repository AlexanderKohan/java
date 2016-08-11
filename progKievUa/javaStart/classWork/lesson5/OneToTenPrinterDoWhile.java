package com.bvan.teaching.javastart.groups.group27.lesson5;

/**
 * @author bvanchuhov
 */
public class OneToTenPrinterDoWhile {

    public static void main(String[] args) {
        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }
}
