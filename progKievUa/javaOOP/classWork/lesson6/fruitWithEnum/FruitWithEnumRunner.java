package progKievUa.javaOOP.classWork.lesson6.fruitWithEnum;
/**
 * @author bvanchuhov
 */
public class FruitWithEnumRunner {

    public static void main(String[] args) {
        Fruit apple = new Fruit(FruitType.APPLE, 20., 0.2);
        Fruit banana = new Fruit(FruitType.BANANA, 33., 0.2);

        System.out.println(apple);
        System.out.println(banana);
    }
}
