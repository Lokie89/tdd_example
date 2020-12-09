package algorithm.knumber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SolutionTest {

    @Test
    void testSolution() {
        int[] answer = new Solution().solution(
                new int[]{1, 5, 2, 6, 3, 7, 4},
                new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}
        );
        assertTrue(Arrays.equals(answer, new int[]{5, 6, 3}));
    }
}
