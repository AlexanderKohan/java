package com.bvan.teaching.javastart.groups.group27.lesson4;

/**
 * @author bvanchuhov
 */
public class StringMethodsSample {

    public static void main(String[] args) {
        String s = "Hello";

        System.out.println(s.contains("ello"));
        System.out.println(s.equals("ello"));
        System.out.println(s.endsWith("ololo"));

        s = s.replace("l", "XXX");
        System.out.println(s);
    }
}
