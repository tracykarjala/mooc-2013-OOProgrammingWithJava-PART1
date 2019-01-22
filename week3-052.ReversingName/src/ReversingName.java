import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        String revName = "";
        int counter = name.length();
        while (counter > 0) {
            counter--;
            revName += name.charAt(counter);
        }
        System.out.println("In reverse order: " + revName);
    }
}
