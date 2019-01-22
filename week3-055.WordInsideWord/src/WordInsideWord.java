
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the first word: ");
        String firstWord = reader.nextLine();
        System.out.print("Type the second word: ");
        String secondWord = reader.nextLine();
        System.out.println(indexOf(firstWord, secondWord));
    }
    public static String indexOf(String word, String contains) {
        if (word.contains(contains)) {
            return "The word '" + contains + "' is found in the word '" + word + "'.";
        } else {
            return "The word '" + contains + "' is not found in the word '" + word + "'.";
        }
    }
}
