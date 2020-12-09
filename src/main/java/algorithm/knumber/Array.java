package algorithm.knumber;

import java.util.Arrays;

public class Array {
    private int[] arrays;

    Array(int[] arrays) {
        this.arrays = arrays;
    }

    Array cut(int[] cutIndex) {
        return new Array(Arrays.copyOfRange(arrays, cutIndex[0] - 1, cutIndex[1]));
    }

    Array sort() {
        Arrays.sort(arrays);
        return new Array(arrays);
    }

    @Override
    public boolean equals(Object obj) {
        Array array = (Array) obj;
        return Arrays.equals(arrays, array.arrays);
    }
}
