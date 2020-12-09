package algorithm.knumber;

import java.util.Arrays;

public class Array {
    private int[] arrays;

    private Array(int[] arrays) {
        this.arrays = arrays;
    }

    public static Array of(int... arrays){
        return new Array(arrays);
    }

    Array cut(int[] cutIndex) {
        return new Array(Arrays.copyOfRange(arrays, cutIndex[0] - 1, cutIndex[1]));
    }

    Array sort() {
        Arrays.sort(arrays);
        return new Array(arrays);
    }

    Array get(int index) {
        return new Array(Arrays.copyOfRange(arrays, index - 1, index));
    }

    @Override
    public boolean equals(Object obj) {
        Array array = (Array) obj;
        return Arrays.equals(arrays, array.arrays);
    }
}
