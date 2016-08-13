package java.progKievUa.javaOOP.classWork.lesson2.dog;

/**
 * Created by Alexander on 7/19/2016.
 */
public class Dog {

    private String name;
    private String ownerName;

    public Dog(String name, String ownerName) {
        checkName(name);
        checkName(ownerName);

        this.name = name;
        this.ownerName = ownerName;
    }

    public void bark() {
        System.out.println("Bark-bark!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        checkName(name);
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        checkName(ownerName);
        this.ownerName = ownerName;
    }

    private void checkName(String name) {
        if (!isName(name)) {
            throw new IllegalArgumentException("illegal name");
        }
    }

    private boolean isName(String s) {
        return s != null && !s.isEmpty();
    }

    @Override
    public String toString() {
        return "Dog{" + "name='" + name + '\'' + ", ownerName='" + ownerName + '\'' + '}';
    }
}

