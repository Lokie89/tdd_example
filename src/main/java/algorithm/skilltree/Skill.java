package algorithm.skilltree;

public class Skill {
    private String skill;

    Skill(String skill) {
        this.skill = skill;
    }

    boolean contains(String tree) {
        return skill.contains(tree);
    }

    boolean isCorrectOrder(String tree) {
        char[] treeCharArray = tree.toCharArray();
        int index = -1;
        for (int i = 0; i < treeCharArray.length; i++) {
            char t = treeCharArray[i];
            int skillIndex = skill.indexOf(String.valueOf(t));
            if (skillIndex < 0) {
                continue;
            }
            if (index > skillIndex) {
                return false;
            }
            index = skillIndex;
        }
        return true;
    }
}
