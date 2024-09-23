import java.io.*;
import java.net.Socket;

public class DemoClient {
    public static void main(String[] args) {
        try {
            System.out.println("DemoClient started");

            // local host IP and any unassigned port to listen to
            Socket socket = new Socket("127.0.0.1", 3000);

            /*
             * BufferedReader class is more suitable than Scanner
             * because Scanner buffer is smaller 1024 char and parses
             * data as parts/tokens for easier manipulation, 
             * whilst Buffered is larger 8192 char
             * and only reads data without any editing or breaking.
             * 'System.in' takes input and convert it to characters
             * 'InputStreamReader' takes characters --> string
             * 'BufferedReader' reads input (string at this case)
             */
            BufferedReader userInput = new BufferedReader
                                    (new InputStreamReader(System.in));

            System.out.print("Enter a string to echo it: ");
            String str = userInput.readLine();

            PrintWriter outWrite = new PrintWriter
                                 (socket.getOutputStream(),true);
            outWrite.println(str);

            BufferedReader serverInput = new BufferedReader
                                    (new InputStreamReader
                                    (socket.getInputStream()));
            System.out.println(serverInput.readLine());

            socket.close();
        } catch (IOException e) {
            System.out.println("I/O Error " + e);
        }
    }
}
