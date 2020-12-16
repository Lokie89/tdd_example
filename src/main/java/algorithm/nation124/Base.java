package algorithm.nation124;

public class Base {

    private int base;
    private int number;

    Base(int base, int number) {
        this.base = base;
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        Base base = (Base) obj;
        return this.base == base.base && this.number == base.number;
    }

    int getNumber(){
        return number;
    }

}
