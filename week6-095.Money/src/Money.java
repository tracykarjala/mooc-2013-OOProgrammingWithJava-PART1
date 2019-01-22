
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money added) {
        return new Money(this.euros + added.euros, this.cents + added.cents);
    }

    public boolean less(Money compared) {
        return (this.euros < compared.euros || (this.euros == compared.euros && this.cents < compared.cents));
    }

    public Money minus(Money decreased) {
        int tempEuros = (this.euros - 1) - decreased.euros;
        int tempCents = (this.cents + 100) - decreased.cents;
        if (tempCents > 99) {
            tempEuros += tempCents / 100;
            tempCents %= 100;
        }
        if (tempEuros < 0) {
            return new Money(0, 0);
        } else {
            return new Money(tempEuros, tempCents);
        }
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
