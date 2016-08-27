package progKievUa.javaOOP.classWork.lesson11;

/**
 * @author bvanchuhov
 */
public class DrinkerSample {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new Drinker()).start();
        }

        System.out.println("Main is finished...");
    }
}

class Drinker implements Runnable {

    private static int nextId;

    private final int id = nextId++;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("I'm " + id + " drinker. " +
                    "I'm drinking " + i + " beer");
        }
    }
}
