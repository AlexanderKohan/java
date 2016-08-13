package java.progKievUa.javaOOP.home.lesson3.computer;

/**
 * Created by Alexander on 8/6/2016.
 */
public class Drive {

    private String manufacturer;

    public Drive(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Drive{" +
                "manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
