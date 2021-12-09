package AfaceToObject.Cpolymorphism.demo03Pratise;

/**
 * @author : Bojack
 * @date : Created in 17:23 2021.11.14
 */
public class Multi02 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();

        USB mouse = new Mouse();
        computer.useDevice(mouse);


        computer.useDevice(new Keyboard());


        computer.poweroff();
    }
}
