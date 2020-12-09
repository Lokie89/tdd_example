package algorithm.knumber;

import java.util.Arrays;

public class Array {
    private int[] arrays;

    private Array(int[] arrays) {
        this.arrays = arrays;
    }

    public static Array of(int... arrays) {
        return new Array(arrays);
    }

    Array cut(int from, int to) {
        return new Array(Arrays.copyOfRange(arrays, from - 1, to));
    }

    Array sort() {
        Arrays.sort(arrays);
        return new Array(arrays);
    }

    int get(int index) {
        return arrays[index - 1];
    }

    @Override
    public boolean equals(Object obj) {
        Array array = (Array) obj;
        return Arrays.equals(arrays, array.arrays);
    }
}
