package avecThread;

import java.io.*;
import java.net.Socket;

public class Service implements Runnable {
    public Socket socket;
    public Service(Socket socket)
    {
        this.socket = socket;
    }
    @Override
    public void run() {
        BufferedReader is = null;
        try {
            is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter os = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
            String qui = is.readLine();
            System.out.println(qui + " vient de se connecter");
            Thread.sleep(7000);
            os.println("J'ai bien reçu ton message " + qui);
            os.flush();

            is.close(); os.close();socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
