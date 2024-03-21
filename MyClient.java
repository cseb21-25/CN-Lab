import java.io.*;
import java.net.*;
import java.util.Scanner; 
public class MyClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 6666);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
	    dout.writeUTF("Server & Client");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your Roll: ");
            String userMessage = scanner.nextLine();
            dout.writeUTF(userMessage);
            dout.flush();

            // Read additional parameters (you can modify this part)
            String additionalData = "Your additional data here"; // Replace with your actual data
            dout.writeUTF(additionalData);
            dout.flush();

            dout.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
