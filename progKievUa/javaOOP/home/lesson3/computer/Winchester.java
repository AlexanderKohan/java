package java.progKievUa.javaOOP.home.lesson3.computer;

/**
 * Created by Alexander on 8/6/2016.
 */
public class Winchester {

    private String manufacturer;
    private int capacity;

    public Winchester(String manufacturer, int capacity) {
        this.manufacturer = manufacturer;
        this.capacity = capacity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Winchester{" +
                "manufacturer='" + manufacturer + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
