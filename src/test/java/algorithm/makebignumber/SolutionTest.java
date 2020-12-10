package algorithm.makebignumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void solutionTest() {
        assertEquals(new Solution().solution("1924", 2), "94");
        assertEquals(new Solution().solution("1231234", 3), "3234");
        assertEquals(new Solution().solution("4177252841", 4), "775841");
    }
}
