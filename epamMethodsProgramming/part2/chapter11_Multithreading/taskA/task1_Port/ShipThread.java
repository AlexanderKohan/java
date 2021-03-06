package epamMethodsProgramming.part2.chapter11_Multithreading.taskA.task1_Port;

/**
 * Created by Alexander on 9/18/2016.
 */

public class ShipThread implements Runnable {
    private Ship ship;
    private Dock dock;

    public ShipThread(Dock dock, Ship ship) {
        this.ship = ship;
        this.dock = dock;
    }

    @Override
    public void run() {
        // dock
        if (!dock.dock()) {
            System.out.println("Cannot dock " + ship);
            return;
        }
        // try place everything to dock
        if (ship.hasCargo()) {
            System.out.println("Try place " + ship.getCurrentWeight() + " to dock");
            if (dock.place(ship.getCurrentWeight())) {
                ship.setCurrentWeight(0);
            }
        }

        // try load
        if (ship.hasSpace()) {
            System.out.println("Try load " + ship.getAvailableSpace() + " to ship");
            ship.addCargo(dock.load(ship.getAvailableSpace()));
        }
        dock.sail();
    }
}
