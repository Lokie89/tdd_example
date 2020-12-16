package algorithm.nation124;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void solutionTest() {
        assertEquals(new Solution().solution(1), "1");
        assertEquals(new Solution().solution(2), "2");
        assertEquals(new Solution().solution(3), "4");
        assertEquals(new Solution().solution(4), "11");
    }

}
