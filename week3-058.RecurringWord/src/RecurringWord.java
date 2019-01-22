
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList
        ArrayList<String> words = new ArrayList<String>();

        while (true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            if (words.contains(word)) {
                break;
            } else {
                words.add(word);
            }
        }

        for (String word: words) {
            System.out.println(word);
        }
        
    }
}
