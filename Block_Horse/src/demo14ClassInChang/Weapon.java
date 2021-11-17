package demo14ClassInChang;

/**
 * @author : Bojack
 * @date : Created in 20:05 2021.11.17
 */
public class Weapon {
    private String WeaponName;

    public Weapon() {
    }

    public Weapon(String weaponName) {
        WeaponName = weaponName;
    }

    public String getWeaponName() {
        return WeaponName;
    }

    public void setWeaponName(String weaponName) {
        WeaponName = weaponName;
    }
}
