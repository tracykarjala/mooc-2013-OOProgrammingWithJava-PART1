
public class Main {

    public static void main(String[] args) {
        // Test your code here
        NightSky night = new NightSky(.15,50,1);
        night.print();
        System.out.println(night.starsInLastPrint());
    }
}
