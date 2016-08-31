package methodsProgramming.part1.introducingInOOP.taskA;

import java.util.Random;

/**
 * Created by Alexander on 8/30/2016.
 */

/*Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.*/

public class Task3_RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        int a = random.nextInt(10);
        int b = random.nextInt(10);
        int c = random.nextInt(10);
        int d = random.nextInt(10);

        System.out.print(a + " ");
        System.out.println(b);
        System.out.print(c + " ");
        System.out.println(d);


    }
}
