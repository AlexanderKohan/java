package progKievUa.javaOOP.classWork.lesson6.fruitWithOutEnum;

/**
 * @author bvanchuhov
 */
public class Fruit {

    public static final int APPLE = 0;
    public static final int BANANA = 1;
    public static final int ORANGE = 2;

    private int type;
    private double price;
    private double weight;

    public Fruit(int type, double price, double weight) {
        setType(type);
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        switch (type) {
            case APPLE: return "Apple";
            case BANANA: return "Banana";
            case ORANGE: return "Orange";
            default: throw new AssertionError();
        }
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        if (type < 0 || type > 2) {
            throw new IllegalArgumentException("no such type: " + type);
        }
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fruit{");
        sb.append("name=").append(getName());
        sb.append(", price=").append(price);
        sb.append(", weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }
}
