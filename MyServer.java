import java.io.*;
import java.net.*;

public class MyServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6666);
            System.out.println("Server is waiting for a connection...");

            Socket s = ss.accept();
            System.out.println("Client connected!");

            // Create input stream to read data from the client
            DataInputStream dis = new DataInputStream(s.getInputStream());

            // Read the initial message from the client
            String clientMessage = dis.readUTF();
            System.out.println("Program Name: " + clientMessage);
            String clientMessage1 = dis.readUTF();
            System.out.println("Roll Number: " + clientMessage1);

            // Read additional parameters (you can modify this part)
            String additionalData = dis.readUTF();
            System.out.println("Message Recived: " + additionalData);

            // Close resources
            dis.close();
            s.close();
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
