package epamMethodsProgramming.part1.chapter5_InnerClasses.taskA;

/**
 * Created by Alexander on 9/2/2016.
 */

/*Создать класс Mobile с внутренним классом, с помощью объектов которого
можно хранить информацию о моделях телефонов и их свойствах.*/

public class Task10_Mobile {
    private String manufacturer;
    private String model;
    private Properties properties;

    public Task10_Mobile(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    private class Properties {
        private String cpu;
        private String screenDiagonal;

        public void setCpu(String cpu) {
            this.cpu = cpu;
        }

        public void setScreenDiagonal(String screenDiagonal) {
            this.screenDiagonal = screenDiagonal;
        }
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

    public String getProperties() {
        if (properties != null) {
            return ("CPU: " + properties.cpu + ", Screen: " + properties.screenDiagonal);
        } else {
            return ("Properties are empty");
        }
    }

    public void createPhoneWithProperties(String cpu, String screenDiagonal) {
        properties = new Properties();
        properties.setCpu(cpu);
        properties.setScreenDiagonal(screenDiagonal);
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Manufacturer '" + manufacturer + "':\n");
        stringBuilder.append("      Model - " + model + "\n");
        stringBuilder.append("      Properties - " + getProperties() + "\n");
        return stringBuilder.toString();
    }
}
