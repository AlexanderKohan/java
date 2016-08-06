package progKievUa.javaOOP.home.lesson3.computer;

/**
 * Created by Alexander on 8/6/2016.
 */
public class Cpu {

    private String manufacturer;
    private String model;
    private double clockFrequency;
    private int numberCores;

    public Cpu(String manufacturer, String model, double clockFrequency, int numberCores) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.clockFrequency = clockFrequency;
        this.numberCores = numberCores;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getClockFrequency() {
        return clockFrequency;
    }

    public void setClockFrequency(double clockFrequency) {
        this.clockFrequency = clockFrequency;
    }

    public int getNumberCores() {
        return numberCores;
    }

    public void setNumberCores(int numberCores) {
        this.numberCores = numberCores;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", clockFrequency=" + clockFrequency +
                ", numberCores=" + numberCores +
                '}';
    }
}
