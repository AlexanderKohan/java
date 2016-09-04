package epamMethodsProgramming.part2.chapter7_Strings.taskA;

import java.util.Scanner;

/**
 * Created by Alexander on 9/4/2016.
 */

/*В каждом слове текста k-ю букву заменить заданным символом. Если k больше длины слова, корректировку не выполнять.*/

public class Task1_ChangeLetter {
    public static void main(String[] args) {
        System.out.println("Enter the text: ");
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String[] stringsArr = text.split(" ");

        System.out.println("Change number of letters: ");
        int n = scanner.nextInt();

        System.out.println("Enter symbol: ");
        char symbol = scanner.next().charAt(0);

        System.out.println("--------------------");
        changeLetter(stringsArr, n, symbol);

        System.out.println();
    }

    private static void changeLetter(String[] stringsArr, int n, char symbol) {
        for (int i = 0; i < stringsArr.length; i++) {
            String[] newStringArr = new String[stringsArr.length];
            if (stringsArr[i].length() > n) {
                newStringArr[i] = stringsArr[i].substring(0, n) + symbol + stringsArr[i].substring(n + 1);
            } else {
                newStringArr[i] = stringsArr[i];
            }
            System.out.println(newStringArr[i]);
        }
    }
}
