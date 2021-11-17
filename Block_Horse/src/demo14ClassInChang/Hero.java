package demo14ClassInChang;

/**
 * @author : Bojack
 * @date : Created in 20:05 2021.11.17
 */
public class Hero {
    private String name;
    private Weapon weapon;
    private int age;

    public Hero() {
    }

    public Hero(String name, Weapon weapon, int age) {
        this.name = name;
        this.weapon = weapon;
        this.age = age;
    }
    public void Fight(){
        System.out.println(age+"的"+name+"使用"+weapon.getWeaponName()+"打败了张高丽");
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
