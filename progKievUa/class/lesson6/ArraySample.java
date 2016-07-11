package progKievUa.classWork.lesson6;

import java.util.Arrays;

/**
 * Created by Alexander on 7/5/2016.
 */
public class ArraySample {

    public static void main(String[] args) {
        int [] a = new int[5];

        a[2] = 10;
        System.out.println(a[2]);

        Arrays.fill(a,1);
        System.out.println(Arrays.toString(a));

        System.out.println(a.length);

        System.out.println("Elem");
        for (int i = 0; i <a.length; i++){
            int elem = a[i];

            System.out.print(a[i]);
        }
        System.out.println();

        System.out.println("For-each");// READ-ONLY
        for (int elem : a){
            System.out.print(elem);
        }
    }
}
