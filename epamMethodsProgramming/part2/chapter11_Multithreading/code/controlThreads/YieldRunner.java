package epamMethodsProgramming.part2.chapter11_Multithreading.code.controlThreads;

/**
 * Created by Alexander on 9/17/2016.
 */
public class YieldRunner {
    public static void main(String[] args) {
        new Thread() { // анонимный класс
            public void run() {
                System.out.println("старт потока 1");
                Thread.yield();
                System.out.println("завершение 1");
            }
        }.start(); // запуск потока
        new Thread() {
            public void run() {
                System.out.println("старт потока 2");
                System.out.println("завершение 2");
            }
        }.start();
    }
}
