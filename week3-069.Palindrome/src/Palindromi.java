import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
        String revText = "";
        int count = text.length();
        while (count > 0) {
            count--;
            revText += text.charAt(count);
        }
        return (text.equals(revText));
        //return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
