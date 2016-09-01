package epamMethodsProgramming.part1.chapter4_InheritanceAndPolymorphism.taskA.Task5_Planet;

/**
 * Created by Alexander on 8/6/2016.
 */
public class PlanetRunner {
    public static void main(String[] args) {

        Planet planet = new Planet();

        planet.addMainland(new Mainland("South America"));
        planet.addMainland(new Mainland("North America"));
        planet.addMainland(new Mainland("Africa"));
        planet.addMainland(new Mainland("Eurasia"));
        planet.addMainland(new Mainland("Australia"));
        planet.addMainland(new Mainland("Antarctica"));

        System.out.println("Mainland = " + planet.getMainland().get(1) + " Planet name = " + planet.PLANET_NAME);
        System.out.println("Number of mainlands = " + planet.getMainland().size());

        System.out.println(planet.toString());
    }
}
