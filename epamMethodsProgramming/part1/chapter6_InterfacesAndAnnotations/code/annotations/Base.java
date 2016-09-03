package epamMethodsProgramming.part1.chapter6_InterfacesAndAnnotations.code.annotations;

/**
 * Created by Alexander on 9/3/2016.
 */

@BaseAction(
        level = 2,
        sqlRequest = "SELECT * FROM phonebook"
)
public class Base {
    public void doAction() {
        Class<Base> f = Base.class;
        BaseAction a = (BaseAction) f.getAnnotation(BaseAction.class);
        System.out.println(a.level());
        System.out.println(a.sqlRequest());
    }
}
