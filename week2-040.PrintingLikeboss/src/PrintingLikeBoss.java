public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        String output = "";
        int i = 0;
        while (i < amount) {
            i++;
            output = output + '*';
        }
        System.out.println(output);
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        String output = "";
        int i = 0;
        while (i < amount) {
            i++;
            output = output + ' ';
        }
        System.out.print(output);
    }

    public static void printTriangle(int size) {
        // 40.2
        int i = 0;
        while (i < size) {
            i++;
            printWhitespaces(size - i);
            printStars(i);
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int stars = 1;
        int whitespace = height - 1;
        int baseWhitespace = height - 2;
        while (height > 0) {
            printWhitespaces(whitespace);
            printStars(stars);
            whitespace--;
            stars += 2;
            height--;
        }
        int baseHeight = 2;
        while (baseHeight > 0) {
            printWhitespaces(baseWhitespace);
            printStars(3);
            baseHeight--;
        }

    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
