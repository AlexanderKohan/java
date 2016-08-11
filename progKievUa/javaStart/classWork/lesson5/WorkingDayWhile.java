package com.bvan.teaching.javastart.groups.group27.lesson5;

/**
 * @author bvanchuhov
 */
public class WorkingDayWhile {

    public static void main(String[] args) {
        int dayOfWeek = 1;

        while (dayOfWeek <= 5) {
            System.out.println(dayOfWeek + ". Work");
            dayOfWeek++;
        }
    }
}
