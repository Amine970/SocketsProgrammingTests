package UDP;

import java.net.*;

public class Emetteur {
    public static void main(String[] args) {
        DatagramSocket datagramSocket = null;
        try {
            datagramSocket = new DatagramSocket();
            String message = "Salut Jean-Serveur !";
            DatagramPacket datagramPacket = new DatagramPacket(message.getBytes(), message.length(), new InetSocketAddress("localhost",11111));
            datagramSocket.send(datagramPacket);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
