package com.bvan.teaching.javastart.sample.types;

/**
 * @author bvanchuhov
 */
public class DoubleComparison {

    public static void main(String[] args) {
        double a = 0.1 + 0.2;
        double b = 0.3;
        double precision = 1.E-6; // 1 * 10^6

        boolean isEquals = Math.abs(a - b) < precision;

        System.out.println(isEquals);
    }
}
