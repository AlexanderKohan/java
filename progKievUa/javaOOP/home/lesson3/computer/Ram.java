package java.progKievUa.javaOOP.home.lesson3.computer;

/**
 * Created by Alexander on 8/6/2016.
 */
public class Ram {

    private String manufacturer;
    private int capacity;
    private String type;

    public Ram(String manufacturer, int capacity, String type) {
        this.manufacturer = manufacturer;
        this.capacity = capacity;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "manufacturer='" + manufacturer + '\'' +
                ", capacity=" + capacity +
                ", type='" + type + '\'' +
                '}';
    }
}
