package sansThread;

import java.io.*;
import java.net.Socket;

public class Client
{
    public static void main(String[] args)
    {
        try {
            Socket socket = new Socket("localhost", 11111);
            BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter os = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
            os.println("Amine");
            os.flush();
            String message = is.readLine();
            System.out.println("Je viens de recevoir le message :" +message);
            is.close(); os.close();socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
