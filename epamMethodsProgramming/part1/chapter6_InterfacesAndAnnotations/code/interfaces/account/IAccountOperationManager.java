package epamMethodsProgramming.part1.chapter6_InterfacesAndAnnotations.code.interfaces.account;

/**
 * Created by Alexander on 9/3/2016.
 */
public interface IAccountOperationManager {

    double depositInCash(int accountNumber, int amount);

    boolean withdraw(int accountNumber, int amount);

    boolean convert(double amount);

    boolean transfer(int accountNumber, double amount);

}