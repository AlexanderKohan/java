package progKievUa.javaOOP.classWork.lesson2.heart;

/**
 * Created by Alexander on 7/20/2016.
 */
final class Heart {
    private final boolean isHappy;

    public Heart(boolean isHappy) {
        this.isHappy = isHappy;
    }

    public Heart brokeHeart() {
        return new Heart(false);
    }

    public boolean isHappy() {
        return isHappy;
    }

    @Override
    public String toString() {
        return "Heart is " + (isHappy ? "happy" : "broken");
    }
}
