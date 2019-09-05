package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Recepteur {
    public static void main(String[] args) {
        try {
            DatagramSocket datagramSocket = new DatagramSocket(11111);
            while(true)
            {
                DatagramPacket datagramPacket = new DatagramPacket(new byte[100], 100);
                datagramSocket.receive(datagramPacket);
                System.out.println("received : " + new String(datagramPacket.getData(),0,datagramPacket.getLength()) + " from " + datagramPacket.getAddress());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
