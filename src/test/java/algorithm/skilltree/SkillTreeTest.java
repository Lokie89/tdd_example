package algorithm.skilltree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// https://programmers.co.kr/learn/courses/30/lessons/49993?language=java
public class SkillTreeTest {

    @Test
    void excludeUnskilledTest() {
        SkillTree skillTree = new SkillTree("BACDE");
        Skill skill = new Skill("CBD");
        skillTree.excludeUnskilled(skill);
        assertEquals(skillTree, new SkillTree("BCD"));
        Skill skill2 = new Skill("D");
        skillTree.excludeUnskilled(skill2);
        assertEquals(skillTree, new SkillTree("D"));
    }

    @Test
    void correctOrderTest() {
        SkillTree skillTree = new SkillTree("ABC");
        assertTrue(skillTree.isCorrectOrder(new Skill("AB")));
        assertFalse(skillTree.isCorrectOrder(new Skill("BC")));
        assertFalse(skillTree.isCorrectOrder(new Skill("CA")));
    }
}
