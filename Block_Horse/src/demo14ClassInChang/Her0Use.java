package demo14ClassInChang;

/**
 * @author : Bojack
 * @date : Created in 20:08 2021.11.17
 */
public class Her0Use {
    public static void main(String[] args) {
        //����Ӣ�۶���
        Hero hero = new Hero();
        //����Ӣ������
        hero.setName("Stephen");
        //����Ӣ������
        hero.setAge(21);
        //������������
        Weapon weapon= new Weapon("AK-47");
//        weapon.setWeaponName("AK-47");
        //��Ӣ���䱸����
        hero.setWeapon(weapon);
        //ʹ�û��򷽷�
        hero.Fight();
    }
}
