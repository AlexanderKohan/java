package progKievUa.homeWork.lesson4;

/**
 * Created by Alexander on 29.06.2016.
 *
 * Вывести все нечетные числа от 100 до 70.
 */
public class Loop_6 {
    public static void main(String[] args) {
        int a = 99;
        int b = 70;

        for (int i = a; b < i; i=i-2){
            System.out.println(i);
        }
    }
}
