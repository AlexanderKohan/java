package epamMethodsProgramming.part1.chapter6_InterfacesAndAnnotations.code.annotations;

/**
 * Created by Alexander on 9/3/2016.
 */
public class AnnoRunner {
    public static void main(String[] args) {
        IAccountOperationManager account = new AccountOperationManagerImpl();
// "регистрация класса" для включения аннотаций в обработку.
        IAccountOperationManager securityAccount =
                SecurityFactory.createSecurityObject(account);
        securityAccount.depositInCash(10128336, 6);
        securityAccount.withdraw(64092376, 2);
        securityAccount.convert(200);
        securityAccount.transfer(64092376, 300);
    }
}
