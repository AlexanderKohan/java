package epamMethodsProgramming.part2.chapter13_Networking.code.internetSupport;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Alexander on 9/20/2016.
 */
public class InetLogic {
    public static void main(String[] args) {
        InetAddress currentIP = null;
        InetAddress bsuIP = null;
        try {
            currentIP = InetAddress.getLocalHost();
// вывод IP-адреса локального компьютера
            System.out.println("Мой IP -> " + currentIP.getHostAddress());
            bsuIP = InetAddress.getByName("www.bsu.by");
// вывод IP-адреса БГУ www.bsu.by
            System.out.println("BSU -> " + bsuIP.getHostAddress());
        } catch (UnknownHostException e) {
// если не удается найти IP
            System.err.println("адрес недоступен " + e);
        }
    }
}
