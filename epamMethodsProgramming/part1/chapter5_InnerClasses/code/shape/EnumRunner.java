package epamMethodsProgramming.part1.chapter5_InnerClasses.code.shape;

/**
 * Created by Alexander on 9/2/2016.
 */
public class EnumRunner {
    public static void main(String[] args) {
        int i = 4;
        for (Shape f : Shape.values()) {
            f.setShape(3, i--);
            System.out.println(f + " площадь= " + f.computeSquare());
        }
    }
}
