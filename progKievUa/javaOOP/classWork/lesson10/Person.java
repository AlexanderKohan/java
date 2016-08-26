package progKievUa.javaOOP.classWork.lesson10;

/**
 * Created by Alexander on 8/26/2016.
 */
public class Person {
    private static int id = 0;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public static synchronized String createID() {
        return String.valueOf(id++);
    }

    public static long getId() {
        return id;
    }

    public static void setId(int id) {
        Person.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
