package demo15InterfaceInChang;

/**
 * @author : Bojack
 * @date : Created in 20:45 2021.11.17
 */
public class Her0Use {
    public static void main(String[] args) {
        Hero hero=new Hero();
        hero.setName("Yushengjun");
//        SkillImpl skill=new SkillImpl();
//        hero.setSkill(skill);
//       Skill skill=new Skill(){
//           @Override
//           public void show() {
//               System.out.println("he He eh ");
//           }
//       };
//       hero.setSkill(skill);
//
        hero.setSkill(new Skill() {
            @Override
            public void show() {
                System.out.println("hhhhh hhhh");
            }
        });
        hero.Fight();


    }
}
