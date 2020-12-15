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
        char[] skillCharArray = skill.toCharArray();
        final int length = Integer.min(skillCharArray.length, tree.length());
        for (int i = 0; i < length; i++) {
            char sk = skillCharArray[i];
            int index = tree.indexOf(String.valueOf(sk));
            if (index != i) {
                return false;
            }
        }
        return true;
    }
}
