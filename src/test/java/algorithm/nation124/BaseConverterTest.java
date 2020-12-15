package algorithm.nation124;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// https://programmers.co.kr/learn/courses/30/lessons/12899?language=java
public class BaseConverterTest {

    @Test
    void convert() {
        BaseConverter baseConverter = new BaseConverter(3);
        Base base = baseConverter.convert(10, 5);
        assertEquals(base, new Base(3, 12));
        Base base2 = baseConverter.convert(4, 123);
        assertEquals(base2, new Base(3, 1000));
    }
}
