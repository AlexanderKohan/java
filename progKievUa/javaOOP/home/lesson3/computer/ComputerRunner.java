package progKievUa.javaOOP.home.lesson3.computer;

/**
 * Created by Alexander on 8/6/2016.
 */
public class ComputerRunner {
    public static void main(String[] args) {
        Computer computer = new Computer("Home PC");

        computer.turnOn();
        computer.turnOff();
        computer.checkViruses();

        System.out.println("Capacity HDD = " + computer.getWinchester().getCapacity());
    }
}
