package com.bvan.teaching.javastart.groups.group27.lesson4;

/**
 * @author bvanchuhov
 */
public class WorkingDayConditions {

    public static void main(String[] args) {
        int dayOfWeek = 5;

        boolean isWorkingDay = dayOfWeek <= 5;
        if (isWorkingDay) {
            System.out.println("Work");
        } else {
            System.out.println("Friends");
        }
        System.out.println("Java Courses");
    }
}
