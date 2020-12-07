package money;

public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
        this.currency = "USD";
    }

    Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }

}
