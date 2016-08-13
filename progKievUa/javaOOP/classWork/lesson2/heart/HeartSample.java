package java.progKievUa.javaOOP.classWork.lesson2.heart;

/**
 * Created by Alexander on 7/20/2016.
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