package java.progKievUa.javaStart.home.lesson4.conditions_OneStar;

/**
 * Created by Alexander on 29.06.2016.
 */
public class Task3_AgeParser{
    public static void main(String[] args) {
        int ageString = 181;

        if (ageString < 0 || ageString > 120) {
            throw new IllegalArgumentException("age must be in the range [from 0 to 120] " + ageString);
        } else {
            System.out.println(ageString);
        }
    }
}