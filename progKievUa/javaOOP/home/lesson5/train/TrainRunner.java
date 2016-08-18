package progKievUa.javaOOP.home.lesson5.train;

/**
 * Created by Alexander on 8/6/2016.
 */

public class TrainRunner {
    public static void main(String[] args) {
        Train train = new Train();

        int expectedLength = findLength(train);

        System.out.println(expectedLength);
        System.out.println(train.isLength(expectedLength));
    }

    private static int findLength(Train train) {
        // your code:)
        return 0;
    }
}
