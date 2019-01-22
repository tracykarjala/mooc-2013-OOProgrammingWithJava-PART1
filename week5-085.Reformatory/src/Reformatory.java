public class Reformatory {
    private int weightsMeasured = 0;

    public int weight(Person person) {
        // return the weight of the person
        weightsMeasured++;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(weight(person) + 1);
    }

    public int totalWeightsMeasured() {
        return weightsMeasured;
    }

}
