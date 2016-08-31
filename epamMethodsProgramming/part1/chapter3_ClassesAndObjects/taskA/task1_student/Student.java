package epamMethodsProgramming.part1.chapter3_ClassesAndObjects.taskA.task1_student;

/**
 * Created by Alexander on 8/31/2016.
 */
public class Student {
    private static long nextId;

    private long id = nextId++;

    String surname;
    String name;
    String patronymic;
    int yearBirthday;
    String address;
    int phoneNumber;
    Faculty faculty;
    Group group;
    Course course;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student(int id, String name, Faculty faculty, Course course, Group group) {
        this.id = id;
        this.name = name;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }


    public static long getNextId() {
        return nextId;
    }

    public static void setNextId(long nextId) {
        Student.nextId = nextId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getYearBirthday() {
        return yearBirthday;
    }

    public void setYearBirthday(int yearBirthday) {
        this.yearBirthday = yearBirthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", yearBirthday='" + yearBirthday + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", faculty=" + faculty +
                ", group=" + group +
                ", course=" + course +
                '}';
    }
}
