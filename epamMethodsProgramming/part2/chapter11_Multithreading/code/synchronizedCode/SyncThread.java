package epamMethodsProgramming.part2.chapter11_Multithreading.code.synchronizedCode;

/**
 * Created by Alexander on 9/17/2016.
 */

public class SyncThread extends Thread {
    private Resource rs;
    public SyncThread(String name, Resource rs) {
        super(name);
        this.rs = rs;
    }
    public void run() {
        for (int i = 0; i < 5; i++) {
            rs.writing(getName(), i); // место срабатывания синхронизации
        }
    }
}
