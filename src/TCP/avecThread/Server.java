package TCP.avecThread;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(11111);
            do {
                Socket socket = serverSocket.accept();
                Thread t = new Thread(new Service(socket));
                t.start();
            }while (true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
