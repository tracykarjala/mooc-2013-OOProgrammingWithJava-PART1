
public class BoundedCounter {
    // copy here the class BoundedCounter from last weeks assignment 78
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        // write code here
        this.value = 0;
        this.upperLimit = upperLimit;
    }

    public void next() {
        // write code here
        if (value + 1 <= upperLimit) {
            value++;
        } else {
            value = 0;
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int newValue) {
        if ( !(newValue < 0) && !(newValue > upperLimit) ) {
            this.value = newValue;
        }
    }

    public String toString() {
        // write code here
        if (value < 10) {
            return "0" + value;
        } else {
            return "" + value;
        }
    }
}
