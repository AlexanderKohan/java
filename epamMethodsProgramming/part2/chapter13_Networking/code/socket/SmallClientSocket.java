package epamMethodsProgramming.part2.chapter13_Networking.code.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by Alexander on 9/20/2016.
 */
public class SmallClientSocket {
    public static void main(String[] args) {
        Socket socket = null;
        try { // получение строки клиентом
            socket = new Socket("ИМЯ_СЕРВЕРА", 8030);
/* здесь "ИМЯ_СЕРВЕРА" компьютер,
на котором стоит сервер-сокет"*/
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    socket.getInputStream()));
            String message = br.readLine();
            System.out.println(message);
        } catch (IOException e) {
            System.err.println("ошибка: " + e);
        } finally {
            if (socket != null) {
                try {// разрыв соединения
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
