import java.util.Objects;

public class Bird {
    private String name;
    private String latinName;
    private int numObservations;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.numObservations = 0;
    }

    public String getName() {
        return name;
    }

    public void incrementObservation() {
        numObservations++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bird bird = (Bird) o;
        return Objects.equals(getName(), bird.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    public int getNumObservations() {
        return numObservations;
    }

    @Override
    public String toString() {
        return name + " (" + latinName + ")";
    }
}
