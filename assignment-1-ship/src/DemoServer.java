import java.io.*;
import java.net.*;

public class DemoServer {
    public static void main(String[] args) {
        try {
            System.out.println("DemoServer started." + '\n' + 
                                "Waiting for client...");

            // special Server socket with a port for listening
            ServerSocket servSock = new ServerSocket(3000);
            Socket newSock = servSock.accept();
            System.out.println("Connection established");

            // reads data from socket rather than keyboard
            BufferedReader input = new BufferedReader
                                    (new InputStreamReader
                                    (newSock.getInputStream()));
            String str = input.readLine();

            PrintWriter printOut = new PrintWriter
                                (newSock.getOutputStream(), true);
            printOut.println("Server: " + str);

            servSock.close();
        } catch (IOException e) {
            System.out.println("I/O Error" + e);
        }
    }
}
