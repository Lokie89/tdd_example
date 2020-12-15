package algorithm.skilltree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// https://programmers.co.kr/learn/courses/30/lessons/49993?language=java
public class SkillTreeTest {

    @Test
    void excludeUnskilledTest(){
        SkillTree skillTree = new SkillTree("BACDE");
        Skill skill = new Skill("CBD");
        skillTree.excludeUnskilled(skill);
        assertEquals(skillTree.skillTree,"BCD");
    }
}
