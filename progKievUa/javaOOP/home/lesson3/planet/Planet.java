package progKievUa.javaOOP.home.lesson3.planet;

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
    public String toString() {
        return "Planet{" +
                "mainlands=" + mainlands +
                ", oceans=" + oceans +
                ", islands=" + islands +
                '}';
    }
}
