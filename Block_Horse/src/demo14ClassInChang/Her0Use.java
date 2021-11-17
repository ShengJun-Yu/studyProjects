package demo14ClassInChang;

/**
 * @author : Bojack
 * @date : Created in 20:08 2021.11.17
 */
public class Her0Use {
    public static void main(String[] args) {
        //创建英雄对象
        Hero hero = new Hero();
        //创建英雄名字
        hero.setName("Stephen");
        //创建英雄年龄
        hero.setAge(21);
        //创建武器对象
        Weapon weapon= new Weapon("AK-47");
//        weapon.setWeaponName("AK-47");
        //给英雄配备武器
        hero.setWeapon(weapon);
        //使用击打方法
        hero.Fight();
    }
}
