package algorithm.knumber;

import java.util.Arrays;

public class Array {
    private int[] arrays;

    Array(int[] arrays) {
        this.arrays = arrays;
    }

    int[] cut(int[] cutIndex) {
        return Arrays.copyOfRange(arrays, cutIndex[0] - 1, cutIndex[1]);
    }

    int[] sort(){
        Arrays.sort(arrays);
        return arrays;
    }
}
