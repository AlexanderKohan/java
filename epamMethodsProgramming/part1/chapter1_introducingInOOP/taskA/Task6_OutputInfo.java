package epamMethodsProgramming.part1.chapter1_introducingInOOP.taskA;

import java.util.Date;

/**
 * Created by Alexander on 8/30/2016.
 */
public class Task6_OutputInfo {
    public static void main(String[] args) {

        String developer = "Alexander ";

        Date dateTakeAsk = new Date(2016, 8, 30, 12, 0);
        Date datePassAsk = new Date(2016, 8, 30, 20, 30);

        System.out.println("Developer: " + developer + ", Date take ask: " + dateTakeAsk + ", Date pass ask: " + datePassAsk);
    }
}
