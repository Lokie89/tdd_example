package algorithm.skilltree;

public class Skill {
    private String skill;

    Skill(String skill) {
        this.skill = skill;
    }

    boolean contains(String tree){
        return skill.contains(tree);
    }
}
