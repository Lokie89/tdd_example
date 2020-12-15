package algorithm.skilltree;

import java.util.Arrays;

public class Solution {
    int solution(String skill, String[] skill_trees) {
        Skill s = new Skill(skill);
        return (int) Arrays.stream(skill_trees).map(SkillTree::new).filter(skillTree -> {
            skillTree.excludeUnskilled(s);
            return skillTree.isCorrectOrder(s);
        }).count();
    }
}
