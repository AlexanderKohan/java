package java.progKievUa.javaStart.home.lesson4.conditions_OneStar;

/**
 * Created by Alexander on 29.06.2016.
 */
public class Task5_ToyNameToIdConverter {
    public static void main(String args[]) {
        String name = "Hello";
        int id;
        switch (name) {
            case "Car":
                id = 0;
                break;
            case "Lego":
                id = 1;
                break;
            case "Doll":
                id = 2;
                break;
            case "Puzzle":
                id = 3;
                break;
            default:
                throw new IllegalArgumentException("id must be in the range [from 0 to 4] ");
        }
        System.out.println(id);
    }
}
