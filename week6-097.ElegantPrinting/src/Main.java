
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        // Write code here
        String output = "";
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                output += array[i] + ", ";
            } else {
                output += array[i];
            }
        }
        System.out.println(output);
    }
}
