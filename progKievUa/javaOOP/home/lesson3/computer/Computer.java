package progKievUa.javaOOP.home.lesson3.computer;

import java.util.Random;

/**
 * Created by Alexander on 8/6/2016.
 */
public class Computer {

    private String name;
    private boolean isTurnedOn;

    private Drive drive = new Drive("Maiwo");
    private Cpu cpu = new Cpu("AMD", "FX-9590", 4.7, 8);
    private Ram ram = new Ram("Kingston", 8, "DDR-4");
    private Winchester winchester = new Winchester("Western", 1000);

    public Computer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    public Drive getDrive() {
        return drive;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public Ram getRam() {
        return ram;
    }

    public Winchester getWinchester() {
        return winchester;
    }

    protected void turnOn() {
        isTurnedOn = true;
        System.out.println("Computer is turned on");
    }

    protected void turnOff() {
        isTurnedOn = false;
        System.out.println("Computer is turned off");
    }

    protected void checkViruses() {
        if (isTurnedOn) {
            Random random = new Random();
            boolean infected = random.nextBoolean();

            System.out.println("Computer is infected? = " + infected);
        } else {
            System.out.println("Check viruses is impossible computer is turned off");
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", drive=" + drive +
                ", cpu=" + cpu +
                ", ram=" + ram +
                ", winchester=" + winchester +
                '}';
    }
}
