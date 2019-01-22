
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int length = name.length();
        int pos = 0;
        while (pos < length) {
            System.out.println((pos + 1) + ". character: " + name.charAt(pos));
            pos++;
        }
    }
}
