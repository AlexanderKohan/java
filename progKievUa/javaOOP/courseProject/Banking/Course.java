package Banking;

/**
 * Created by Alexander on 8/15/2016.
 */
public enum Course {
    EUR("eur", 25.5500),
    USD("usd", 28.5759),
    RUB("rub", 0.3994),
    GBP("gbp", 32.9029),
    CHF("chf", 26.2646),
    CAD("cad", 19.7762),
    JPY("jpy", 0.2523),
    PLN("pln", 6.6791),
    AUD("aud", 19.6084),
    DKK("dkk", 3.8403),
    NOK("nok", 3.1087),
    SEK("sek", 3.0193),
    CZK("czk", 1.0566),
    ILS("ils", 6.7294),
    HUF("huf", 0.0922);

    private final String course;
    private final double exchangeRates;

    Course(String course, double exchangeRates) {
        this.course = course;
        this.exchangeRates = exchangeRates;
    }

    public String getCourse() {
        return course;
    }

    public double getExchangeRates() {
        return exchangeRates;
    }

    @Override
    public String toString() {
        return "Course{" +
                "course='" + course + '\'' +
                ", exchangeRates=" + exchangeRates +
                '}';
    }
}

