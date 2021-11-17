package demo15InterfaceInChang;

/**
 * @author : Bojack
 * @date : Created in 20:42 2021.11.17
 */
public class Hero {
    private String name ;
    private Skill skill;

    public Hero() {
    }

    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }
    public void Fight(){
        System.out.println(name+"ÊÍ·Å¼¼ÄÜ");
        skill.show();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
