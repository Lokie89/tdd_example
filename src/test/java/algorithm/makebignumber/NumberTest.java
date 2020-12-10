package algorithm.makebignumber;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

// https://programmers.co.kr/learn/courses/30/lessons/42883?language=java
public class NumberTest {

    @Test
    void deleteNumberTest() {
        Number number = new Number("1924");
        int[] deletedNumbers = number.delete(2);
        assertEquals(Arrays.equals(deletedNumbers, new int[]{12, 14, 19, 24, 92, 94}));
    }
}
