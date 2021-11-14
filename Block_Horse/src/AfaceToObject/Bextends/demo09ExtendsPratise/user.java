package AfaceToObject.Bextends.demo09ExtendsPratise;

/**
 * @author : Bojack
 * @date : Created in 20:56 2021.11.08
 */
public class user {
    private String name;
    private int money;

    public void show() {
        System.out.println("My name is" + name + "," + "I have" + money + "$!");
    }

    public user() {
    }

    public user(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
