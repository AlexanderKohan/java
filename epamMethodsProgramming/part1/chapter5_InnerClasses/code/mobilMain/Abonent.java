package epamMethodsProgramming.part1.chapter5_InnerClasses.code.mobilMain;

import java.util.Random;

/**
 * Created by Alexander on 9/2/2016.
 */
public class Abonent {
    private long id;
    private String name;
    private String tariffPlan;
    private PhoneNumber phoneNumber;

    public Abonent(long id, String name) {
        this.id = id;
        this.name = name;
    }

    private class PhoneNumber {
        private int countryCode;
        private int netCode;
        private int number;

        private void setCountryCode(int countryCode) {
            this.countryCode = countryCode;
        }

        private void setNetCode(int netCode) {
            this.netCode = netCode;
        }

        public int generateNumber() {
            int temp = new Random().nextInt(10_000_000);
            number = temp;
            return number;
        }
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTariffPlan() {
        return tariffPlan;
    }

    public void setTariffPlan(String tariffPlan) {
        this.tariffPlan = tariffPlan;
    }

    public String getPhoneNumber() {
        if (phoneNumber != null) {
            return ("+" + phoneNumber.countryCode + "-" + phoneNumber.netCode + "-" + phoneNumber.number);
        } else {
            return ("phone number is empty");
        }
    }

    public void obtainPhoneNumber(int countryCode, int netCode) {
        phoneNumber = new PhoneNumber();
        phoneNumber.setCountryCode(countryCode);
        phoneNumber.setNetCode(netCode);
        phoneNumber.generateNumber();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(100);
        stringBuilder.append("Abonent '" + name + "':\n");
        stringBuilder.append("      ID - " + id + "\n");
        stringBuilder.append("      Tariff Plan - " + tariffPlan + "\n");
        stringBuilder.append("      Phone Number - " + getPhoneNumber() + "\n");
        return stringBuilder.toString();
    }
}
