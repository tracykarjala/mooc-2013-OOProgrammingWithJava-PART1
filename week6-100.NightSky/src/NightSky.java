import java.util.Random;

public class NightSky {
    private int width;
    private int height;
    private double density;
    private int starsInLastPrint;

    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
        this.starsInLastPrint = 0;
    }

    public NightSky(int width, int height) {
        this.width = width;
        this.height = height;
        this.density = 0.10;
        this.starsInLastPrint = 0;
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
        this.starsInLastPrint = 0;
    }

    public void printLine() {
        Random random = new Random();
        String line = "";
        int numStars = 0;
        for (int i = 0; i < width; i++) {
            double item = random.nextDouble();
            if (item <= density) {
                line += "*";
                numStars++;
            } else {
                line += " ";
            }
        }
        System.out.println(line);
        this.starsInLastPrint += numStars;
    }

    public void print() {
        this.starsInLastPrint = 0;
        for (int i = 0; i < height; i++) {
            printLine();
        }
    }

    public int starsInLastPrint() {
        return this.starsInLastPrint;
    }
}
