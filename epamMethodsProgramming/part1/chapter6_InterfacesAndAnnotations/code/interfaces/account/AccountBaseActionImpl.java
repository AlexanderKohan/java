package epamMethodsProgramming.part1.chapter6_InterfacesAndAnnotations.code.interfaces.account;

/**
 * Created by Alexander on 9/3/2016.
 */
public class AccountBaseActionImpl implements IAccountBaseAction {

    @Override
    public boolean openAccount() {
        return false;
    }

    @Override
    public boolean closeAccount() {
        return false;
    }

    @Override
    public void blocking() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void unBlocking() {

    }
}
