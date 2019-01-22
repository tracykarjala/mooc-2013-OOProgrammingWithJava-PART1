import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private Random random = new Random();
    private int length;
    private String chars = "abcdefghijklmnopqrstuvwxyz";

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        String passwd = "";
        int count = 1;
        while (count <= length) {
            passwd += this.chars.charAt(random.nextInt(25));
            count++;
        }
        return passwd;
    }
}
