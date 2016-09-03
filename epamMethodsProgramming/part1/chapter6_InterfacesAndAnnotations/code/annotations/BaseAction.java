package epamMethodsProgramming.part1.chapter6_InterfacesAndAnnotations.code.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Created by Alexander on 9/3/2016.
 */

@Target(ElementType.TYPE)
public @interface BaseAction {
    int level();
    String sqlRequest();
}
