package algorithm.makebignumber;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

// https://programmers.co.kr/learn/courses/30/lessons/42883?language=java
public class NumberTest {

    @Test
    void deleteNumberTest() {
        Number number = new Number("35");
        int[] deletedNumbers = number.delete(1);
        assertTrue(Arrays.equals(deletedNumbers, new int[]{3, 5}));

        Number number2 = new Number("77");
        int[] deletedNumbers2 = number2.delete(1);
        assertTrue(Arrays.equals(deletedNumbers2, new int[]{7}));
    }

    @Test
    void deleteNumberOverOneTest() {
        Number number = new Number("345");
        int[] deletedNumbers = number.delete(2);
        assertTrue(Arrays.equals(deletedNumbers, new int[]{3, 4, 5}));
    }
}
