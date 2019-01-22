import java.util.ArrayList;

public class DB {
    private ArrayList<Bird> birds;

    public DB() {
        this.birds = new ArrayList<Bird>();
    }

    public void addBird(String name, String latinName) {
        Bird newBird = new Bird(name, latinName);
        for (Bird bird: birds) {
            if (bird.equals(newBird)) {
                return;
            }
        }
        birds.add(newBird);
    }

    public void addObservation(String name) {
        for (Bird bird: birds) {
            if (bird.getName().equals(name)) {
                bird.incrementObservation();
                return;
            } else {
                System.out.println("Is not a bird!");
            }
        }
    }

    public void showBird(String name) {
        for (Bird bird: birds) {
            if (bird.getName().equals(name)) {
                printBird(bird);
            }
        }
    }

    public void statistics() {
        if (birds.isEmpty()) {
            return;
        } else {
            for (Bird bird : birds) {
                printBird(bird);
            }
        }
    }

    public void printBird(Bird bird) {
        System.out.println(bird + ": " + bird.getNumObservations() + " observations");
    }
}
