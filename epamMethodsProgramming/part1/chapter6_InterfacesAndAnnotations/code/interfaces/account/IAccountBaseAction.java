package epamMethodsProgramming.part1.chapter6_InterfacesAndAnnotations.code.interfaces.account;

/**
 * Created by Alexander on 9/3/2016.
 */

public interface IAccountBaseAction {

    boolean openAccount();

    boolean closeAccount();

    void blocking();

    void unBlocking();

}