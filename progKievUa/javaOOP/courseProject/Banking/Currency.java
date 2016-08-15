package Banking;

import java.util.Date;

/**
 * Created by Don on 31.07.2016.
 */

public class Currency {

    private Course course;
    private String name;
    private Date date = new Date();

    public Currency(Course course, String name) {
        this.course = course;
        this.name = name;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Currency{" +
                " name='" + name + '\'' +
                " course=" + course +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Currency currency = (Currency) o;

        if (course != currency.course) return false;
        if (name != null ? !name.equals(currency.name) : currency.name != null) return false;
        return date != null ? date.equals(currency.date) : currency.date == null;

    }

    @Override
    public int hashCode() {
        int result = course != null ? course.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }
}