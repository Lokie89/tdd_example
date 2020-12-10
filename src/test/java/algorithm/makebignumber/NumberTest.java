package algorithm.makebignumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// https://programmers.co.kr/learn/courses/30/lessons/42883?language=java
public class NumberTest {

    @Test
    void deleteNumberTest() {
        Number number = new Number("35");
        assertEquals(number.delete(1), "5");

        Number number2 = new Number("77");
        assertEquals(number2.delete(1), "7");
    }

    @Test
    void deleteNumberOverOneTest() {

        Number number = new Number("345");
        assertEquals(number.delete(2), "5");

        Number number2 = new Number("12345");
        assertEquals(number2.delete(3), "45");

    }
}
