package progKievUa.javaOOP.classWork.lesson2.heart;

/**
 * Created by Alexander on 7/20/2016.
 */
class Person {
    private Heart heart = new Heart(true);

    public Heart getHeart() {
        return heart;
    }

    @Override
    public String toString() {
        return "I have heart. " + heart;
    }
}