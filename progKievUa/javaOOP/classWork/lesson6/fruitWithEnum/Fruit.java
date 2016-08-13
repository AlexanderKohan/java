package progKievUa.javaOOP.classWork.lesson6.fruitWithEnum;

/**
 * @author bvanchuhov
 */
public class Fruit {

    private FruitType fruitType;
    private double price;
    private double weight;

    public Fruit(FruitType fruitType, double price, double weight) {
        this.fruitType = fruitType;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fruit{");
        sb.append("fruit=").append(fruitType.getFruitName());
        sb.append(", price=").append(price);
        sb.append(", weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }
}
