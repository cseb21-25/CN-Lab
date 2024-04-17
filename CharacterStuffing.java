
import java.util.Scanner;

public class CharacterStuffing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter plain text: ");
        String source = scanner.nextLine();

        String stuffed = characterStuffing(source);
        System.out.println("After character stuffing: " + stuffed);

        String destuffed = characterDestuffing(stuffed);
        System.out.println("After character de-stuffing: " + destuffed);
    }

    public static String characterStuffing(String source) {
        StringBuilder stuffed = new StringBuilder();
        stuffed.append("dlestx");
        for (int i = 0; i < source.length(); i++) {
            if (source.charAt(i) == 'd' && (i + 1) < source.length() && source.charAt(i + 1) == 'l' && (i + 2) < source.length() && source.charAt(i + 2) == 'e') {
                stuffed.append("dle");
                stuffed.append("dle");
                i += 2;
            } else {
                stuffed.append(source.charAt(i));
            }
        }
        stuffed.append("dlestx");
        return stuffed.toString();
    }

    public static String characterDestuffing(String stuffed) {
        StringBuilder destuffed = new StringBuilder();
        for (int i = 6; i < stuffed.length() - 6; i++) {
            if (stuffed.charAt(i) == 'd' && (i + 1) < stuffed.length() - 6 && stuffed.charAt(i + 1) == 'l' && (i + 2) < stuffed.length() - 6 && stuffed.charAt(i + 2) == 'e') {
                destuffed.append("dle");
                i += 5;
            } else {
                destuffed.append(stuffed.charAt(i));
            }
        }
        return destuffed.toString();
    }
}
