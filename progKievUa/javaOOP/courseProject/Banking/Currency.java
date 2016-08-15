package Banking;

import java.util.Date;

/**
 * Created by Don on 31.07.2016.
 */

public class Currency {
    private long COURSE;
    private String name;
    private Date date = new Date();

    public Currency(String name, long COURSE) {
        this.name = name;
        this.COURSE = COURSE;
    }

    public double getCOURSE() {
        return COURSE;
    }

    public void setCOURSE(long COURSE) {
        this.COURSE = COURSE;
    }

    @Override
    public String toString() {
        return "Currency{" +
                " name='" + name + '\'' +
                " COURSE=" + COURSE +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Currency currency = (Currency) o;

        if (Double.compare(currency.COURSE, COURSE) != 0) return false;
        if (!name.equals(currency.name)) return false;
        return date.equals(currency.date);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(COURSE);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + name.hashCode();
        result = 31 * result + date.hashCode();
        return result;
    }
}