package algorithm.knumber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Arrays;


// https://programmers.co.kr/learn/courses/30/lessons/42748
public class ArrayTest {

    @Test
    void testCutArray() {
        Array array = new Array(new int[]{1, 5, 2, 6, 3, 7, 4});
        assertEquals(array.cut(new int[]{1, 2}), new Array(new int[]{1, 5}));
        assertEquals(array.cut(new int[]{1, 3}), new Array(new int[]{1, 5, 2}));
    }

    @Test
    void testSortArray() {
        Array array = new Array(new int[]{1, 5, 2, 6, 3, 7, 4});
        assertEquals(array.sort(), new Array(new int[]{1, 2, 3, 4, 5, 6, 7}));
    }

    @Test
    void testCutSortArray() {
        Array array = new Array(new int[]{1, 5, 2, 6, 3, 7, 4});
        assertEquals(array.cut(new int[]{1, 3}).sort(), new Array(new int[]{1, 2, 5}));
    }

    @Test
    void testGetArray() {
        Array array = new Array(new int[]{1, 5, 2, 6, 3, 7, 4});
        assertEquals(array.get(3), new Array(new int[]{2}));
    }
}
