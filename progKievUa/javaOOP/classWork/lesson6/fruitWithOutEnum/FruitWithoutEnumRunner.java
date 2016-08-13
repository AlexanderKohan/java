package progKievUa.javaOOP.classWork.lesson6.fruitWithOutEnum;

/**
 * @author bvanchuhov
 */
public class FruitWithoutEnumRunner {

    public static void main(String[] args) {
        Fruit apple = new Fruit(Fruit.APPLE, 20., 0.2);
        Fruit banana = new Fruit(Fruit.BANANA, 33., 0.15);

        System.out.println(apple);
        System.out.println(banana);
    }
}
