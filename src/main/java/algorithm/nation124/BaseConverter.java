package algorithm.nation124;

public class BaseConverter {

    private int base;

    BaseConverter(int base) {
        this.base = base;
    }

    Base convert(int base, int number) {
        if (this.base == base) {
            return new Base(base, number);
        }
        int based10 = based10(base, number);
        StringBuilder sb = new StringBuilder();
        while (based10 > 0) {
            sb.append(based10 % this.base);
            based10 /= this.base;
        }
        sb.reverse();
        return new Base(this.base, Integer.parseInt(sb.toString()));
    }

    private int based10(int base, int number) {
        char[] chars = String.valueOf(number).toCharArray();
        int based10 = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            based10 += (chars[i] - 48) * Math.pow(base, i);
        }
        return based10;
    }

}
