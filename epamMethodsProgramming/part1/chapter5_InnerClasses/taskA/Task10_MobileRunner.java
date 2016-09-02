package epamMethodsProgramming.part1.chapter5_InnerClasses.taskA;

/**
 * Created by Alexander on 9/3/2016.
 */
public class Task10_MobileRunner {
    public static void main(String[] args) {
        Task10_Mobile task10_mobile = new Task10_Mobile("LG", "G4 Leather Black");
        task10_mobile.createPhoneWithProperties("Qualcomm", "2560х1440");
        System.out.println(task10_mobile);
    }
}
