import java.util.Scanner;
import java.util.Date;

public class StopAndWaitProtocol {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, seq;
        String[] frames;
        Date time1, time2;

        System.out.println("Enter the number of frames:");
        n = scanner.nextInt();
        frames = new String[n];

        for (int i = 0; i < n; i++) {
            seq = i + 1;
            System.out.println("Enter frame " + seq + ":");
            frames[i] = scanner.next();

            System.out.println("Transmitting frame " + seq + "...");
            time1 = new Date();
            System.out.println("Transmission started at: " + time1);

            try {
                Thread.sleep(5000); // Simulate transmission time (5 seconds)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            time2 = new Date();
            System.out.println("Transmission completed at: " + time2);
            System.out.println("Received frame " + seq);
        }

        System.out.println("Received frames:");
        for (String frame : frames) {
            System.out.print(frame + " ");
        }
    }
}
