package money;

public class Franc extends Money {

    public Franc(int amount) {
        this.amount = amount;
        this.currency = "CHF";
    }

    Money times(int multiplier) {
        return Money.franc(amount * multiplier);
    }

}
