
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: ");
        String word = reader.nextLine();
        System.out.print("Length of the first part: ");
        int length = Integer.parseInt(reader.nextLine());
        System.out.println("Result: " + substring(word, length));

    }

    public static String substring(String text, int length) {
        return text.substring(0, length);
    }
}
