package algorithm.skilltree;

public class SkillTree {
    private String skillTree;

    SkillTree(String skillTree) {
        this.skillTree = skillTree;
    }

    void excludeUnskilled(Skill skill) {
        String[] splitSkillTrees = skillTree.split("");
        StringBuilder sb = new StringBuilder();
        for (String splitSkillTree : splitSkillTrees) {
            if (skill.contains(splitSkillTree)) {
                sb.append(splitSkillTree);
            }
        }
        skillTree = sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        SkillTree skillTree = (SkillTree) obj;
        return this.skillTree.equals(skillTree.skillTree);
    }
}
