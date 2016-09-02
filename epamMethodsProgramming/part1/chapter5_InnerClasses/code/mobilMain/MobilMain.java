package epamMethodsProgramming.part1.chapter5_InnerClasses.code.mobilMain;

/**
 * Created by Alexander on 9/2/2016.
 */
public class MobilMain {
    public static void main(String[] args) {
        Abonent abonent = new Abonent(819002, "Alla Ivanova");
        abonent.setTariffPlan("free");
        abonent.obtainPhoneNumber(375,25);
        System.out.println(abonent);
    }
}
