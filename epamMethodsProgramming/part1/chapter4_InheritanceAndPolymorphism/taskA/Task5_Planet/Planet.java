package epamMethodsProgramming.part1.chapter4_InheritanceAndPolymorphism.taskA.Task5_Planet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexander on 8/6/2016.
 */
public class Planet {

    public static final String PLANET_NAME = "Earth";

    private List<Mainland> mainlands = new ArrayList<>();
    private List<Ocean> oceans = new ArrayList<>();
    private List<Island> islands = new ArrayList<>();


    public List<Mainland> getMainland() {
        return mainlands;
    }

    public void addMainland(Mainland mainland) {
        this.mainlands.add(mainland);
    }

    public List<Ocean> getOceans() {
        return oceans;
    }

    public void addOceans(Ocean ocean) {
        this.oceans.add(ocean);
    }

    public List<Island> getIslands() {
        return islands;
    }

    public void addIsland(Island island) {
        this.islands.add(island);
    }

    private void printMainland() {
        for (Mainland counter : this.mainlands) {
            System.out.println(counter.getName() + ", ");
        }
        System.out.println();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Planet planet = (Planet) o;

        if (mainlands != null ? !mainlands.equals(planet.mainlands) : planet.mainlands != null) return false;
        if (oceans != null ? !oceans.equals(planet.oceans) : planet.oceans != null) return false;
        return islands != null ? islands.equals(planet.islands) : planet.islands == null;

    }

    @Override
    public int hashCode() {
        int result = mainlands != null ? mainlands.hashCode() : 0;
        result = 31 * result + (oceans != null ? oceans.hashCode() : 0);
        result = 31 * result + (islands != null ? islands.hashCode() : 0);
        return result;
    }

    @Override
    public String toString(){
        return getClass().getName() + "@planet name" + PLANET_NAME + " mainlands: " + mainlands + " oceans: " + oceans + " islands: " +
                islands;
    }

}
