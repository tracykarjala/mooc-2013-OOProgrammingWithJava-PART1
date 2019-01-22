import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // write testcode here
        int[] test = {6, 3, 0, -1, 4, 12, -4};
        sort(test);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int num: array) {
            if (num < smallest) {
                smallest = num;
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int smallest = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int start) {
        int smallest = array[start];
        int index = start;
        for (int i = start; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int val1 = array[index1];
        int val2 = array[index2];
        array[index1] = val2;
        array[index2] = val1;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, index);
            //System.out.println(Arrays.toString(array));
        }
    }

}
