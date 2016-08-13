package progKievUa.javaOOP.classWork.lesson2.homeCode.fun;

/**
 * @author Bohdan Vanchuhov
 */
public class HeartSample {
    public static void main(String[] args) {
        Person boy = new Person();
        System.out.println(boy);

        Heart heartInGirlHand = boy.getHeart();
        // After some time
        heartInGirlHand.brokeHeart();

        System.out.println(boy);
    }
}

class Person {
    private Heart heart = new Heart();

    public Heart getHeart() {
        return heart;
    }

    @Override
    public String toString() {
        return "I have heart. " + heart;
    }
}

class Heart {
    private boolean isHappy = true;

    public void brokeHeart() {
        isHappy = false;
    }

    @Override
    public String toString() {
        return "Heart is " + (isHappy ? "happy" : "broken");
    }
}
