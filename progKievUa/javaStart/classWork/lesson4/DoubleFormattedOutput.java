package com.bvan.teaching.javastart.sample.types;

/**
 * @author bvanchuhov
 */
public class DoubleFormattedOutput {

    public static void main(String[] args) {
        double d = 1. / 3;

        String s = String.format("%10.3f", d);
        System.out.println(s);
    }
}
