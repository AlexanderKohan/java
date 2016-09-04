package epamMethodsProgramming.part2.chapter7_Strings.code.locale;

import java.util.Locale;

/**
 * Created by Alexander on 9/4/2016.
 */
public class ResourceManagerRun {
    public static void main(String[ ] args) {
        ResourceManager manager = ResourceManager.INSTANCE;
        System.out.println(manager.getString("str1"));
        manager.changeResource(new Locale("be","BY"));
        System.out.println(manager.getString("str1"));
    }
}
