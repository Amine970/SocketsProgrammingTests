package TCP.sansThread;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
    public static void main(String[] args)
    {
        ServerSocket serverSocket;
        try {
            serverSocket = new ServerSocket(11111);
            do
            {
                Socket socket = serverSocket.accept();
                BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter os = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
                String qui = is.readLine();
                System.out.println(qui + " vient de se connecter");
                Thread.sleep(5000);
                os.println("J'ai bien reçu ton message " + qui);
                os.flush();

                is.close(); os.close();socket.close();
            }while (true);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
