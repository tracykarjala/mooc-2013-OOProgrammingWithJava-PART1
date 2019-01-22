

public class Main {

    public static void main(String[] args) {
        // write testcode here
    }

    public static int[] copy(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public static int[] reverseCopy(int[] array) {
        int[] newArray = new int[array.length];
        int counter = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            newArray[counter] = array[i];
            counter++;
        }
        return newArray;
    }
    
}
