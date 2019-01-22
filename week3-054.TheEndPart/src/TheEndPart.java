import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: ");
        String word = reader.nextLine();
        System.out.print("Length of the end part: ");
        int length = Integer.parseInt(reader.nextLine());
        System.out.println("Result: " + substring(word, length));
    }

    public static String substring(String text, int number) {
        String result = "";
        int start = text.length() - number;
        while (start < text.length()) {
            result += text.charAt(start);
            start++;
        }
        return result;

    }
}
