package progKievUa.javaStart.home.lesson4.conditions_OneStar;

/**
 * Created by Alexander on 29.06.2016.
 */
public class Task4_IdToToyNameConverter {
    public static void main(String[] args) throws IllegalAccessException {

        int x = 1;

        if (x < 0 || x > 4) {
            throw new IllegalArgumentException("x must be in the range [from 0 to 4] " + x);
        }else if (x == 0) {
            System.out.println("Car");
        }else if (x == 1) {
            System.out.println("Lego");
        }else if (x == 2) {
            System.out.println("Doll");
        }else if (x == 3) {
            System.out.println("Puzzle");
        }
    }
}
