package algorithm.skilltree;

public class SkillTree {
    String skillTree;

    SkillTree(String skillTree) {
        this.skillTree = skillTree;
    }

    void excludeUnskilled(Skill skill) {
        String[] splitSkillTrees = skillTree.split("");
        StringBuilder sb = new StringBuilder();
        for (String splitSkillTree : splitSkillTrees) {
            if (skill.skill.contains(splitSkillTree)) {
                sb.append(splitSkillTree);
            }
        }
        skillTree = sb.toString();
    }
}
