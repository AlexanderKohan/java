package epamMethodsProgramming.part1.chapter5_InnerClasses.code.ship;

/**
 * Created by Alexander on 9/2/2016.
 */
public class Ship {
    private int id;

    // abstract, final, private, protected - допустимы
    public static class LifeBoat {
        private int boatId;
        public static void down() {
            System.out.println("шлюпки на воду!");
        }
        public void swim() {
            System.out.println("отплытие шлюпки");
        }
    }
}
