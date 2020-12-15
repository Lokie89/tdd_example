package algorithm.skilltree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    void solutionTest() {
        assertEquals(new Solution().solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"}), 2);
    }
}
