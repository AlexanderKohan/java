package epamMethodsProgramming.part1.chapter5_InnerClasses.code.ship;

/**
 * Created by Alexander on 9/2/2016.
 */
public class ShipRunner {
    public static void main(String[] args) {
// вызов статического метода
        Ship.LifeBoat.down();
// создание объекта статического класса
        Ship.LifeBoat lifeBoat = new Ship.LifeBoat();
// вызов обычного метода
        lifeBoat.swim();
    }
}
