package epamMethodsProgramming.part2.chapter11_Multithreading.code.waitNotifyNotifyAll;

/**
 * Created by Alexander on 9/17/2016.
 */
public class PaymentRunner {
    public static void main(String[] args) throws InterruptedException {
        final Payment payment = new Payment();
        new Thread() {
            public void run() {
                payment.doPayment(); // вызов synchronized метода
            }
        }.start();
        Thread.sleep(200);
        synchronized (payment) { // 1-ый блок
            System.out.println("Init amount:");
            payment.initAmount();
            payment.notify(); // уведомление о возврате блокировки
        }
        synchronized (payment) { // 2-ой блок
            payment.wait(1_000);
            System.out.println("ok");
        }
    }
}
