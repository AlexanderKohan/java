package com.bvan.teaching.javastart.sample.types;

/**
 * @author Bohdan Vanchuhov
 */
public class MoneyStoring {

    public static final int MONEY_COEFFICIENT = 10_000_000; // Java 7

    public static void main(String[] args) {
        long moneyInDollars = 248739491; // Точное хранение
        double moneyForOutput = (double) moneyInDollars / MONEY_COEFFICIENT;

        System.out.println(moneyForOutput);
    }
}
