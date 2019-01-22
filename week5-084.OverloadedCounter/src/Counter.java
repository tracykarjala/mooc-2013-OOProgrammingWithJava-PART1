public class Counter {
    private int value;
    private boolean check;

    public Counter(int StartingValue, boolean check) {
        this.value = StartingValue;
        this.check = check;
    }

    public Counter (int StartingValue) {
        this(StartingValue, false);
    }

    public Counter(boolean check) {
        this(0, check);
    }

    public Counter() {
        this(0, false);
    }

    public int value() {
        return value;
    }

    public void increase(int amount) {
        if ( !(amount < 0) ) {
            value += amount;
        }
    }

    public void increase() {
        this.increase(1);
    }

    public void decrease(int amount) {
        if (amount < 0) {
            return;
        }
        if (check) {
            if ( (value - amount < 0) ) {
                value = 0;
            } else {
                value -= amount;
            }
        } else {
            value -= amount;
        }
    }

    public void decrease() {
        this.decrease(1);
    }
}
