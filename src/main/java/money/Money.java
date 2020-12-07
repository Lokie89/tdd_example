package money;

public abstract class Money {
    protected int amount;

    static Dollar dollar(int amount){
        return new Dollar(amount);
    }

    static Franc franc(int amount){
        return new Franc(amount);
    }

    abstract Money times(int multiplier);

    abstract String currency();

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }
}
