import java.util.Scanner;

public class BitStuffing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input bit sequence:");
        String input = scanner.next();
        String stuffedSequence = bitStuffing(input);
        String destuffedSequence = bitDestuffing(stuffedSequence, input.length());
        System.out.println("Stuffed Bit Sequence: " + stuffedSequence);
        System.out.println("Destuffed Bit Sequence: " + destuffedSequence);
    }
    private static String bitStuffing(String input) {
        StringBuilder stuffedSequence = new StringBuilder();
        char[] prePost = {'0', '1', '1', '1', '1', '1', '1', '0'};
        int consecutiveOnes = 0;
        for (char bit : input.toCharArray()) {
            stuffedSequence.append(bit);
            if (bit == '1') {
                consecutiveOnes++;
                if (consecutiveOnes == 5) {
                    stuffedSequence.append('0');
                    consecutiveOnes = 0;
                }
            } else {
                consecutiveOnes = 0;
            }
        }
        stuffedSequence.insert(0, prePost);
        stuffedSequence.append(prePost);
        return stuffedSequence.toString();
    }
    private static String bitDestuffing(String stuffedSequence, int inputLength) {
        StringBuilder destuffedSequence = new StringBuilder();
        int consecutiveOnes = 0;
        for (int i = 8; i < stuffedSequence.length() - 8; i++) {
            char bit = stuffedSequence.charAt(i);
            destuffedSequence.append(bit);
            if (bit == '1') {
                consecutiveOnes++;
                if (consecutiveOnes == 5) {
                    i++;
                    consecutiveOnes = 0;
                }
            } else {
                consecutiveOnes = 0;
            }
        }
        return destuffedSequence.toString();
    }
}
