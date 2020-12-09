package algorithm.knumber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

// https://programmers.co.kr/learn/courses/30/lessons/42748
public class ArrayTest {

    @Test
    void testCutArray() {
        Array array = Array.of(1, 5, 2, 6, 3, 7, 4);
        assertEquals(array.cut(1, 2), Array.of(1, 5));
        assertEquals(array.cut(1, 3), Array.of(1, 5, 2));
    }

    @Test
    void testSortArray() {
        Array array = Array.of(1, 5, 2, 6, 3, 7, 4);
        assertEquals(array.sort(), Array.of(1, 2, 3, 4, 5, 6, 7));
    }

    @Test
    void testCutSortArray() {
        Array array = Array.of(1, 5, 2, 6, 3, 7, 4);
        assertEquals(array.cut(1, 3).sort(), Array.of(1, 2, 5));
    }

    @Test
    void testGetArray() {
        Array array = Array.of(1, 5, 2, 6, 3, 7, 4);
        assertEquals(array.get(3), Array.of(2));
    }
}
