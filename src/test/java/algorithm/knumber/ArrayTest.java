package algorithm.knumber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Arrays;


// https://programmers.co.kr/learn/courses/30/lessons/42748
public class ArrayTest {

    @Test
    void testCutArray() {
        Array array = new Array(new int[]{1, 5, 2, 6, 3, 7, 4});
        assertTrue(Arrays.equals(array.cut(new int[]{1, 2}), new int[]{1, 5}));
        assertTrue(Arrays.equals(array.cut(new int[]{1, 3}), new int[]{1, 5, 2}));
    }
}
