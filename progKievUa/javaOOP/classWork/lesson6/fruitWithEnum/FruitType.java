package progKievUa.javaOOP.classWork.lesson6.fruitWithEnum;

import java.util.Objects;

/**
 * @author bvanchuhov
 */
public enum FruitType {
    APPLE("Apple"),
    BANANA("Banana"),
    ORANGE("Orange");

    private final String fruitName;

    public static FruitType byFruitName(String fruitName) {
        for (FruitType fruitType : FruitType.values()) {
            if (Objects.equals(fruitType.getFruitName(), fruitName)) {
                return fruitType;
            }
        }
        throw new IllegalArgumentException("no such fruit with name " + fruitName);
    }

    FruitType(String fruitName) {
        this.fruitName = fruitName;
    }

    public String getFruitName() {
        return fruitName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FruitType{");
        sb.append("fruitName='").append(fruitName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
